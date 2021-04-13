import java.util.Scanner; // Coding untuk memasukkan paket Scanner

public class welcome extends pkonsumsi { // Class anak welcome dari induk pkonsumsi
    public void info(){ // Method void public untuk menampilkan informasi produk bank
        System.out.println("");
        System.out.println("|       Selamat datang di Rizki Bank        |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Kami menyediakan 2 jenis layanan pinjaman |");
        System.out.println("|           1. Kredit Modal Usaha           |");
        System.out.println("|         2. Kredit Modal Konsumtif         |");
        System.out.println("|-------------------------------------------|");
        System.out.println("");
        System.out.println("|Silakan pilih salah satu program diatas (masukkan angka!)");

        System.out.print("|Silakan Masukkan Pilihan Anda : ");
        Scanner input = new Scanner(System.in); // Membuat Scanner baru
        pilihan = input.nextInt(); // Input pilihan
    }
    public void setPilihan(int pilihan){ // Method public void untuk memberikan set nilai berupa pilihan user
        this.pilihan = pilihan;
    }
    public int getPilihan() { // Method public non void untuk menampilkan pilihan program user
        System.out.println("");
        if (pilihan == 1) { // Menggunakan percabangan untuk memilih program
            System.out.println("|Yang Anda Pilih Adalah Program : " + pilihan + " (Kredit Modal Usaha)");
            return pilihan;
        } else if (pilihan == 2){
            System.out.println("|Yang Anda Pilih Adalah Program : " + pilihan + " (Kredit Modal Konsumtif)");
            return pilihan;
        }
        return pilihan;
    }
}
