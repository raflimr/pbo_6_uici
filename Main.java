import packagelib.PackageDemo; // Mengimpor kelas PackageDemo dari package 'packagelib'
import com.example.simplemath.*; // Memanggil file jar dari library dibuat sendiri
import org.apache.log4j.*; // Built-in Package library Log4j untuk logging

class Main {

  static Logger log = Logger.getLogger(Main.class.getName()); // Attribute untuk membuat logger

  public static void main(String[] args) {

    // Konfigurasi default untuk Log4j
    BasicConfigurator.configure();
    log.info("Hello this is an info message"); // Logging pesan informasi

    // Membuat objek PackageDemo dan menjalankan metode demo
    PackageDemo packageDemo = new PackageDemo();
    packageDemo.demo();

    // Membuat objek Perkalian dan menjalankan metode perkalian dua angka
    Perkalian perkalian = new Perkalian();
    int hasil = perkalian.perkalianDuaAngka(2, 3);
    System.out.println("Hasil Perkalian dua angka: " + hasil); // Menampilkan hasil perkalian

    // Membuat objek Pembagian dan menjalankan metode pembagian dua angka
    Pembagian pembagian = new Pembagian();
    int hasilBagi = pembagian.pembagianDuaAngka(6, 3);
    log.info("Hasil bagi: " + hasilBagi); // Logging hasil pembagian
  }
}
