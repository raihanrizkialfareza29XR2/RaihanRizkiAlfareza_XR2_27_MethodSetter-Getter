import java.util.Scanner; // Coding untuk memasukkan paket Scanner

public class main extends pkonsumsi { // Class main dari induk pkonsumsi
    public static void main(String[] args) { // Method main
        welcome object1 = new welcome(); //Membuat objek baru (kuhus method static tidak usah karena tidak butuh objek baru)
        pusaha usaha = new pusaha();
        pkonsumsi konsumtif = new pkonsumsi();


        while (konsumtif.running) { // Perulangan while untuk pilihan mengulang kembali program oleh user

            Scanner input = new Scanner(System.in); // Membuat Scanner baru

            object1.info(); // Memanggil method info
            object1.setPilihan(object1.pilihan); // Memanggil method setPilihan dengan parameter

            object1.getPilihan(); // Memanggil method getPilihan

            if (object1.pilihan == 1) { // Percabangan untuk menjalankan salah satu program yang dipilih
                konsumtif.Biodata(); // Memanggil method Biodata
                konsumtif.setNama(konsumtif.nama); // Memanggil method setNama dengan parameter
                konsumtif.getNama(); // Memanggil method getNama
                konsumtif.setTlahir(konsumtif.tlahir); // Memanggil method setTlahir dengan parameter
                konsumtif.getTlahir(); // Memanggil method getTlahir
                konsumtif.setKota(konsumtif.kota); // Memanggil method setKota dengan parameter
                konsumtif.getKota(); // Memanggil method getKota
                konsumtif.setPenghasilan(konsumtif.penghasilan); // Memanggil method setPenghasilan dengan parameter
                konsumtif.getPenghasilan(); // Memanggil method getPenghasilan
                konsumtif.setPinjaman(konsumtif.pinjaman); // Memanggil method setPinjaman dengan parameter
                konsumtif.getPinjaman(); // Memanggil method getPinjaman
                konsumtif.setDurasi(konsumtif.durasi); // Memanggil method setDurasi dengan parameter
                konsumtif.getDurasi(); // Memanggil method getDurasi
                konsumtif.getRasio(); // Memanggil method getRasio
                if (konsumtif.rasio > 40){ //Percabagan untuk menentukan pinjaman dapat dicairkan atau tidak berdaasarkan rasio pendapatan terhadap penghasilan user
                    pkonsumsi.getAlert();
                }else{
                    pkonsumsi.getAlert2();
                }
            } else if (object1.pilihan == 2) {
                usaha.Biodata();
                usaha.setNama(usaha.nama);
                usaha.getNama();
                usaha.setTlahir(usaha.tlahir);
                usaha.getTlahir();
                usaha.setKota(usaha.kota);
                usaha.getKota();
                usaha.setUsaha(usaha.usaha);
                usaha.getUsaha();
                usaha.setPenghasilan(usaha.penghasilan);
                usaha.getPenghasilan();
                usaha.setPinjaman(usaha.pinjaman);
                usaha.getPinjaman();
                usaha.setDurasi(usaha.durasi);
                usaha.getDurasi();
                usaha.getRasio();
                if (usaha.rasio > 40){
                    pusaha.getAlert();
                }else{
                    pusaha.getAlert2();
                }
            }
            System.out.println("");
            System.out.print("|Apakah Anda Ingin Mengulang dan Mengoreksi Ulang Data Diatas? (Y/T) : ");
            konsumtif.ulangi = input.nextLine(); // Input pilihan user
            if (konsumtif.ulangi.equalsIgnoreCase("T")) {
                konsumtif.running = false; // Jika user menginputkan Y, maka program akan mengulang dari awal. Begitupun sebaliknya
            }
        }
    }
}
