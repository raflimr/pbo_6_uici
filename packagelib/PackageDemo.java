package packagelib;

import java.util.Scanner; // Built-in Package untuk membaca input dari pengguna

public class PackageDemo {

  // Metode untuk mendemonstrasikan perhitungan luas dan keliling persegi panjang
  public void demo() {
    int panjang, lebar, hasil; // Attribute untuk menyimpan panjang, lebar, dan hasil
    String karakter; // Attribute untuk menyimpan pilihan input pengguna

    hasil = 0; // Inisialisasi nilai awal hasil
    Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

    // Menampilkan deskripsi program
    System.out.println("Program Penghitung Luas dan Keliling Persegi panjang");
    System.out.print("Masukan Panjang Persegi: ");
    panjang = sc.nextInt(); // Membaca input panjang dari pengguna

    System.out.print("Masukan Luas Persegi: ");
    lebar = sc.nextInt(); // Membaca input lebar dari pengguna

    // Memberikan pilihan kepada pengguna untuk menghitung luas atau keliling
    System.out.println("Tekan (L) untuk melihat Luas");
    System.out.print("Tekan (K) untuk melihat Keliling: ");
    karakter = sc.next(); // Membaca input pilihan dari pengguna

    // Menggunakan switch untuk menentukan operasi berdasarkan input pengguna
    switch (karakter) {
      case "L": // Jika pengguna memilih "L", hitung luas
        hasil = panjang * lebar;
        break;

      case "K": // Jika pengguna memilih "K", hitung keliling
        hasil = 2 * (panjang + lebar);
        break;

      default: // Jika input tidak valid
        System.out.print("Anda salah memasukan inputan");
        break;
    }

    sc.close(); // Menutup Scanner setelah selesai digunakan

    // Menampilkan hasil akhir
    System.out.print("Hasilnya adalah: " + hasil);
    System.out.println();
  }
}
