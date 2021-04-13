import java.util.Scanner; // Coding untuk memasukkan paket Scanner

public class pkonsumsi { // Class induk pkonsumsi
    String nama; // Deklarasi awal Variabel Instance
    String usaha;
    String tlahir;
    String kota;
    double penghasilan;
    double pinjaman;
    double bunga;
    double cicilan;
    double cicilann;
    int durasi;
    int pilihan;
    boolean running = true; // Digunakan saat melakukan perulangan
    String ulangi;
    double rasio;


    Scanner input = new Scanner(System.in); // Membuat Scanner baru

    public void Biodata(){ // Method void public untuk input data user
        System.out.println("");
        System.out.print("|Silakan Masukkan Nama Anda : ");
        nama = input.nextLine(); // Input Nama
        System.out.println("");
        System.out.print("|Silakan Masukkan Tanggal Lahir Anda : ");
        tlahir = input.nextLine(); // Input Tanggal Lahir
        System.out.println("");
        System.out.print("|Silakan Masukkan Kota Asal Anda : ");
        kota = input.nextLine(); // Input Kota Asal
        System.out.println("");
        System.out.print("|Silakan Masukkan Penghasilan Tetap Anda (per bulan) : ");
        penghasilan = input.nextDouble(); // Input Penghasilan User
        System.out.println("");
        System.out.print("|Silakan Masukkan Nominal Pinjaman Anda : ");
        pinjaman = input.nextDouble(); // Input Nominal Pinjaman
        System.out.println("");
        System.out.print("|Silakan Masukkan Durasi Pembayaran Cicilan Pinjaman Anda (bulan) : ");
        durasi = input.nextInt(); // Input Durasi Pembayaran Cicilan
    }

    public void setNama(String nama){ // Method public void untuk memberikan set nilai berupa nama user
        this.nama = nama;
    }
    public String getNama(){ // Method public non void untuk menampilkan nama user
        System.out.println("");
        System.out.println("|Nama Anda Adalah : " + nama);
        return nama;
    }
    public void setTlahir(String tlahir){ // Method public void untuk memberikan set nilai berupa tanggal lahir user
        this.tlahir = tlahir;
    }
    public String getTlahir(){ // Method public non void untuk menampilkan tanggal lahir user
        System.out.println("");
        System.out.println("|Tanggal Lahir Anda : " + tlahir);
        return tlahir;
    }
    public void setKota(String kota){ // Method public void untuk memberikan set nilai berupa kota asal user
        this.kota = kota;
    }
    public String getKota(){ // Method public non void untuk menampilkan kota asal user
        System.out.println("");
        System.out.println("|Asal Kota : " + kota);
        return kota;
    }
    public void setPenghasilan(double penghasilan){ // Method public void untuk memberikan set nilai berupa penghasilan user
        this.penghasilan = penghasilan;
    }
    public double getPenghasilan(){ // Method public non void untuk menampilkan penghasilan user
        System.out.println("");
        System.out.println("|Penghasilan Tetap per Bulan : " + penghasilan);
        return penghasilan;
    }
    public void setPinjaman(double pinjaman){ // Method public void untuk memberikan set nilai berupa nominal pinjaman user
        this.pinjaman = pinjaman;
    }
    public double getPinjaman(){ // Method public non void untuk menampilkan nominal pinjaman user
        System.out.println("");
        System.out.println("|Nominal Pinjaman yang Diajukan : " + pinjaman);
        return pinjaman;
    }
    public void setDurasi(int durasi){ // Method public void untuk memberikan set nilai berupa durasi cicilan user
        this.durasi = durasi;
    }
    public int getDurasi(){ // Method public non void untuk menampilkan durasi cicilan user
        System.out.println("");
        System.out.println("|Anda Akan Dikenakan Bunga Sebesar 3,5% / Tahun");
        bunga = (pinjaman*3.5/100); // Rumus menghitung bunga
        cicilan = (pinjaman+bunga); // Rumus menghitung cicilan
        cicilann = (cicilan/durasi);
        System.out.println("");
        System.out.println("|Rincian Pinjaman : Bunga = jumlah pinjaman x 3.5%"); // Menampilkan output rincian perhitungan pinjaman user
        System.out.println("                    Bunga pinjaman = " + pinjaman + " x 3.5% = " + bunga);
        System.out.println("                    Cicilan = (jumlah pinjaman + bunga) : durasi pinjaman");
        System.out.println("                    Cicilan = (" + pinjaman + " + " + bunga + ") : " + durasi + " = " + cicilann);
        System.out.println("");
        System.out.println("                    Maka, Jumlah Cicilan yang Harus Anda Bayarkan Tiap Bulannya Adalah : " + cicilann + " Rupiah");
        return (int) cicilan;
    }
    public void getRasio(){ // Method public void untuk menampilkan rasio cicilan terhadap penghasilan user
        rasio = (cicilann*100)/penghasilan; // Rumus rasio cicilan terhadap penghasilan user
        System.out.println("");
        System.out.println("                    Rasio Cicilan Anda Terhadap Pendapatan : " + rasio + "%");
    }
    public static void getAlert(){ // Method public static void untuk menampilkan informasi pencairan
        System.out.println("");
        System.out.println("|Mohon Maaf, Jika Rasio Cicilan Terhadap Penghasilan Anda Sudah Lebih");
        System.out.println(" dari 40%, maka kami tidak dapat mencairkan pinjaman terkait. Karena");
        System.out.println(" hal tersebut mengindikasikan kemungkinan gagal bayar yang cukup tinggi.");
    }
    public static void getAlert2(){ // Method public static void untuk menampilkan informasi pencairan
        System.out.println("");
        System.out.println("|Rasio Cicilan Terhadap Penghasilan Anda Rendah. Pinjaman Akan Segera Kami Cairkan, Terima Kasih..");
    }
}
