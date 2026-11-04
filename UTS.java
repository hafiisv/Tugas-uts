package belajar.uts;

import java.util.Scanner;

//import java.util.Scanner;

public class belajar {
    // soal 1
    // public static void main(String[] args) {
    //     String kata = "halo";
    //     String kataTerbalik = new StringBuilder(kata).reverse().toString();
    //     System.out.println("Kata awal: " + kata);
    //     System.out.println("Hasil dibalik: " + kataTerbalik);
    // }

// soal 2
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);

//         System.out.print("Masukkan kalimat: ");
//         String kalimat = input.nextLine();

//         System.out.print("Masukkan huruf yang dicari: ");
//         char huruf = input.next().charAt(0);

//         int jumlah = 0;

//         for (int i = 0; i < kalimat.length(); i++) {
//             if (Character.toLowerCase(kalimat.charAt(i)) ==
//                 Character.toLowerCase(huruf)) {
//                 jumlah++;
//             }
//         }

//         System.out.println("Huruf '" + huruf +
//                 "' ditemukan sebanyak " + jumlah + " kali.");

//         input.close();
    
//     }
public static void main(String[] args) {
    
// soal 3
// Scanner input = new Scanner(System.in);

//         System.out.print("Masukkan kalimat: ");
//         String kalimat = input.nextLine();

//         int jumlah = kalimat.length();

//         System.out.println("Jumlah karakter: " + jumlah);

//         input.close();
    
// 
// soal 5
// for (int i=6; i>=1; i--){
//     for(int j=1 ; j<=i;j++){
//         System.out.print(i);
//     }
// }
//     System.out.println();
// soal 6
// System.out.println("112123123412345123456");
// soal 7
// System.out.println("654321543214321321211");
// soal 8
// System.out.println("12333123455555123456");
// soal 9
//   for (int i = 1; i<= 6 ; i++){
//             if(i % 2 == 0){
//                 for (int j = 0;j<i;j++)System.out.print(i);
//             }else{
//                 for (int j=1;j<=i;j++)System.out.print(j);
//             }
//        } 
//         System.out.println();
// soal 10
// for (int i = 6; i >= 1; i--) {
//             System.out.print(i);
//         }

//         for (int i = 1; i <= 5; i++) {
//             System.out.print(5);
//         }

//         for (int i = 4; i >= 1; i--) {
//             System.out.print(i);
//         }

//         for (int i = 1; i <= 3; i++) {
//             System.out.print(3);
//         }

//         for (int i = 2; i >= 1; i--) {
//             System.out.print(i);
//         }

//         System.out.println();
// soal 11
//   for (int i = 6; i>= 1 ; i--){
//             if(i % 2 == 0){
//                 for (int j = 0;j<i;j++)System.out.print(i);
//             }else{
//                 for (int j=1;j<=i;j++)System.out.print(j);
//             }
//        } 
//         System.out.println();
// soal no 12
       // System.out.println("12212312345555566666612345678999999999");
//soal 13
       //System.out.println("112333444412345123456777777788888888123456789");
//soal 14
    
   // System.out.println("8888888887777777654321543214444333211");
// soal 15
//    StringBuilder sb = new StringBuilder();
//         for (int n = 8; n >= 1; n--) {
//             if (((n + 1) / 2) % 2 == 0) {
//                 // angka menurun: n, n-1, ..., 1
//                 for (int j = n; j >= 1; j--) {
//                     sb.append(j);
//                 }
//             } else {
//                 // angka n diulang n kali
//                 for (int j = 1; j <= n; j++) {
//                     sb.append(n);
//                 }
//             }
//         }

//         System.out.println(sb);

//soal 16
//    int n = 1;

//         for (int i = 1; i <= 12; i++) {
//             System.out.print(n + " ");

//             if (i % 2 == 1) {
//                 n += 4;   // iterasi ganjil: tambah 4
//             } else {
//                 n -= 2;   // iterasi genap: kurangi 2
//             }
//         }
// soal 17
// 17. n+10, n-5, ...
//         int n = 2;
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(n + " ");
//             n += (i % 2 == 1) ? 10 : -5;
//         }
//         System.out.println();
// //soal 18
//         // 18. n-3, n+5, ...
//         n = 5;
//         for (int i = 1; i <= 12; i++) {
//             System.out.print(n + " ");
//             n += (i % 2 == 1) ? -3 : 5;
//         }
//         System.out.println();
// //soal 19
//         // 19. n*3, n-5, ...
//         n = 3;
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(n + " ");
//             n = (i % 2 == 1) ? n * 3 : n - 5;
//         }
//         System.out.println();
// //soal 20
//         // 20. n+1, n+2, n+3, ... (berulang)
//         n = 1;
//         for (int i = 1; i <= 13; i++) {
//             System.out.print(n + " ");
//             n += (i % 3 == 0) ? 3 : i % 3;
//         }
//         System.out.println();
// //soal 21
//         // 21. n*2
//         n = 1;
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(n + " ");
//             n *= 2;
//         }
//         System.out.println();
//soal 22
// Scanner sc= new Scanner(System.in);
//         System.out.print("Masukkan n: ");
//         int n = input.nextInt();

//         long hasil = 1;
//         StringBuilder sb = new StringBuilder(n + "! = ");

//         for (int i = n; i >= 1; i--) {
//             hasil *= i;
//             sb.append(i);
//             if (i > 1) sb.append(" x ");
//         }

//         System.out.println(sb + " = " + hasil);
//soal 23
// Scanner input = new Scanner(System.in);
//         System.out.print("Masukkan nilai maksimum: ");
//         int max = input.nextInt();

//         int a = 0, b = 1;

//         while (a <= max) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//soal 24
// Scanner input = new Scanner(System.in);

//         int n_awal, n_akhir;

//         System.out.print("Masukkan tahun awal: ");
//         n_awal = input.nextInt();

//         System.out.print("Masukkan tahun akhir: ");
//         n_akhir = input.nextInt();

//         System.out.println("Tahun kabisat yang angka terakhirnya 0:");

//         for (int tahun = n_awal; tahun <= n_akhir; tahun++) {

//             if ((tahun % 400 == 0 ||
//                 (tahun % 4 == 0 && tahun % 100 != 0))
//                 && tahun % 10 == 0) {

//                 System.out.println(tahun);
//             }
//         }

        ///input.close();
//soal 25
// Scanner input = new Scanner(System.in);

//         int n_awal, n_akhir;

//         System.out.print("Masukkan tahun awal: ");
//         n_awal = input.nextInt();

//         System.out.print("Masukkan tahun akhir: ");
//         n_akhir = input.nextInt();

//         System.out.println("Tahun kabisat yang angka terakhirnya 2:");

//         for (int tahun = n_awal; tahun <= n_akhir; tahun++) {

//             if ((tahun % 400 == 0 ||
//                 (tahun % 4 == 0 && tahun % 100 != 2))
//                 && tahun % 10 == 2) {

//                 System.out.println(tahun);
//             }
//         }

//         input.close();
//soal 26
// Scanner input = new Scanner(System.in);

//         int n_awal, n_akhir;

//         System.out.print("Masukkan tahun awal: ");
//         n_awal = input.nextInt();

//         System.out.print("Masukkan tahun akhir: ");
//         n_akhir = input.nextInt();

//         System.out.println("Tahun kabisat yang angka terakhirnya 4:");

//         for (int tahun = n_awal; tahun <= n_akhir; tahun++) {

//             if ((tahun % 400 == 0 ||
//                 (tahun % 4 == 0 && tahun % 100 != 4))
//                 && tahun % 10 == 4) {

//                 System.out.println(tahun);
//             }
//         }

//         input.close();
//soal 27
// Scanner input = new Scanner(System.in);

//         int n_awal, n_akhir;

//         System.out.print("Masukkan tahun awal: ");
//         n_awal = input.nextInt();

//         System.out.print("Masukkan tahun akhir: ");
//         n_akhir = input.nextInt();

//         System.out.println("Tahun kabisat yang angka terakhirnya 6:");

//         for (int tahun = n_awal; tahun <= n_akhir; tahun++) {

//             if ((tahun % 400 == 0 ||
//                 (tahun % 4 == 0 && tahun % 100 != 6))
//                 && tahun % 10 == 6) {

//                 System.out.println(tahun);
//             }
//         }

//         input.close();
//soal 28
// Scanner input = new Scanner(System.in);

//         int n_awal, n_akhir;

//         System.out.print("Masukkan tahun awal: ");
//         n_awal = input.nextInt();

//         System.out.print("Masukkan tahun akhir: ");
//         n_akhir = input.nextInt();

//         System.out.println("Tahun kabisat yang angka terakhirnya 8:");

//         for (int tahun = n_awal; tahun <= n_akhir; tahun++) {

//             if ((tahun % 400 == 0 ||
//                 (tahun % 4 == 0 && tahun % 100 != 8))
//                 && tahun % 10 == 8) {

//                 System.out.println(tahun);
//             }
//         }

//         input.close();
//soal 29
// Scanner scanner = new Scanner(System.in);

//         // Input n_awal dan n_akhir dari pengguna
//         System.out.print("Masukkan n_awal  : ");
//         int n_awal = scanner.nextInt();

//         System.out.print("Masukkan n_akhir : ");
//         int n_akhir = scanner.nextInt();

//         System.out.println("\nBilangan yang habis dibagi 3 dari " + n_awal + " sampai " + n_akhir + " adalah:");

//         // Perulangan dari n_awal hingga n_akhir
//         for (int i = n_awal; i <= n_akhir; i++) {
//             // Memeriksa apakah bilangan habis dibagi 3 (sisa bagi 0)
//             if (i % 3 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println(); // Baris baru
//         scanner.close();
//soal 30
// Scanner scanner = new Scanner(System.in);

//         // Input n_awal dan n_akhir dari pengguna
//         System.out.print("Masukkan n_awal  : ");
//         int n_awal = scanner.nextInt();

//         System.out.print("Masukkan n_akhir : ");
//         int n_akhir = scanner.nextInt();

//         System.out.println("\nBilangan yang habis dibagi 4 dari " + n_awal + " sampai " + n_akhir + " adalah:");

//         // Perulangan dari n_awal hingga n_akhir
//         for (int i = n_awal; i <= n_akhir; i++) {
//             // Memeriksa apakah bilangan habis dibagi 4 (sisa bagi 0)
//             if (i % 4 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println(); // Baris baru
//         scanner.close();
//soal 31
// Scanner scanner = new Scanner(System.in);

//         // Input n_awal dan n_akhir dari pengguna
//         System.out.print("Masukkan n_awal  : ");
//         int n_awal = scanner.nextInt();

//         System.out.print("Masukkan n_akhir : ");
//         int n_akhir = scanner.nextInt();

//         System.out.println("\nBilangan yang habis dibagi 6 dari " + n_awal + " sampai " + n_akhir + " adalah:");

//         // Perulangan dari n_awal hingga n_akhir
//         for (int i = n_awal; i <= n_akhir; i++) {
//             // Memeriksa apakah bilangan habis dibagi 5 (sisa bagi 0)
//             if (i % 5 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println(); // Baris baru
//         scanner.close();
//soal 32
// Scanner scanner = new Scanner(System.in);

//         // Input n_awal dan n_akhir dari pengguna
//         System.out.print("Masukkan n_awal  : ");
//         int n_awal = scanner.nextInt();

//         System.out.print("Masukkan n_akhir : ");
//         int n_akhir = scanner.nextInt();

//         System.out.println("\nBilangan yang habis dibagi 3 dari " + n_awal + " sampai " + n_akhir + " adalah:");

//         // Perulangan dari n_awal hingga n_akhir
//         for (int i = n_awal; i <= n_akhir; i++) {
//             // Memeriksa apakah bilangan habis dibagi 6 (sisa bagi 0)
//             if (i % 6 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println(); // Baris baru
//         scanner.close();
//soal 33
// Scanner scanner = new Scanner(System.in);

//         // Input n_awal dan n_akhir dari pengguna
//         System.out.print("Masukkan n_awal  : ");
//         int n_awal = scanner.nextInt();

//         System.out.print("Masukkan n_akhir : ");
//         int n_akhir = scanner.nextInt();

//         System.out.println("\nBilangan yang habis dibagi 3 dari " + n_awal + " sampai " + n_akhir + " adalah:");

//         // Perulangan dari n_awal hingga n_akhir
//         for (int i = n_awal; i <= n_akhir; i++) {
//             // Memeriksa apakah bilangan habis dibagi 7 (sisa bagi 0)
//             if (i % 7 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println(); // Baris baru
//         scanner.close();

//soal 34-39 menggunakan public static void main(String[] args) throws InterruptedException {
    
//soal 34
// int lebar = 30;     // lebar baris (jumlah kolom)
//         int posisi = 0;     // posisi angka 0 saat ini
//         int arah = 1;       // 1 = ke kanan, -1 = ke kiri

//         while (true) {
//             // bangun satu baris: spasi semua, kecuali di posisi angka 0
//             StringBuilder baris = new StringBuilder();
//             for (int i = 0; i < lebar; i++) {
//                 baris.append(i == posisi ? '0' : ' ');
//             }

//             // \r mengembalikan kursor ke awal baris, jadi baris ditimpa
//             System.out.print("\r" + baris);
//             System.out.flush();

//             Thread.sleep(100);  // jeda 100 ms antar frame

//             // balik arah saat menyentuh ujung kiri atau kanan
//             if (posisi == lebar - 1) {
//                 arah = -1;
//             } else if (posisi == 0) {
//                 arah = 1;
//             }
//             posisi += arah;
//         }
//soal 35
// int lebar = 30;      // lebar baris (jumlah kolom)
//         int bolakBalik = 3;  // berapa kali kiri -> kanan -> kiri

//         for (int putaran = 0; putaran < bolakBalik; putaran++) {

//             // kiri atas -> kanan atas
//             for (int posisi = 0; posisi < lebar; posisi++) {
//                 tampilkan(posisi, lebar);
//             }

//             // kanan atas -> kiri atas
//             for (int posisi = lebar - 2; posisi >= 0; posisi--) {
//                 tampilkan(posisi, lebar);
//             }
//         }
//         System.out.println();
//     }

//     static void tampilkan(int posisi, int lebar) throws InterruptedException {
//         StringBuilder baris = new StringBuilder();
//         for (int i = 0; i < lebar; i++) {
//             baris.append(i == posisi ? '0' : ' ');
//         }

//         System.out.print("\r" + baris);  // \r menimpa baris yang sama
//         System.out.flush();
//         Thread.sleep(100);               // kecepatan animasi (ms)
//soal 36
// int lebar = 30;      // lebar lintasan (jumlah kolom)
//         int bolakBalik = 3;  // berapa kali kiri -> kanan -> kiri

//         System.out.print("\033[2J");    // bersihkan layar
//         System.out.print("\033[?25l");  // sembunyikan kursor

//         for (int putaran = 0; putaran < bolakBalik; putaran++) {

//             // kiri bawah -> kanan bawah
//             for (int posisi = 0; posisi < lebar; posisi++) {
//                 tampilkan(posisi, lebar);
//             }

//             // kanan bawah -> kiri bawah
//             for (int posisi = lebar - 2; posisi >= 0; posisi--) {
//                 tampilkan(posisi, lebar);
//             }
//         }

//         System.out.print("\033[?25h");  // tampilkan kursor lagi
//         System.out.println();
//     }

//     static void tampilkan(int posisi, int lebar) throws InterruptedException {
//         StringBuilder baris = new StringBuilder();
//         for (int i = 0; i < lebar; i++) {
//             baris.append(i == posisi ? '0' : ' ');
//         }

//         // pindahkan kursor ke baris paling bawah, kolom 1, lalu cetak
//         System.out.print("\033[999;1H" + baris);
//         System.out.flush();
//         Thread.sleep(100);  // kecepatan animasi (ms)
//soal 37
// int lebar = 30;      // lebar lintasan (jumlah kolom)
//         int bolakBalik = 3;  // berapa kali kiri -> kanan -> kiri

//         System.out.print("\033[2J");    // bersihkan layar
//         System.out.print("\033[?25l");  // sembunyikan kursor

//         for (int putaran = 0; putaran < bolakBalik; putaran++) {

//             // kiri bawah -> kanan bawah
//             for (int posisi = 0; posisi < lebar; posisi++) {
//                 tampilkan(posisi, lebar);
//             }

//             // kanan bawah -> kiri bawah
//             for (int posisi = lebar - 2; posisi >= 0; posisi--) {
//                 tampilkan(posisi, lebar);
//             }
//         }

//         System.out.print("\033[?25h");  // tampilkan kursor lagi
//         System.out.println();
//     }

//     static void tampilkan(int posisi, int lebar) throws InterruptedException {
//         StringBuilder baris = new StringBuilder();
//         for (int i = 0; i < lebar; i++) {
//             baris.append(i == posisi ? '0' : ' ');
//         }

//         // pindahkan kursor ke baris paling bawah, kolom 1, lalu cetak
//         System.out.print("\033[999;1H" + baris);
//         System.out.flush();
//      Thread.sleep(100);  // kecepatan animasi (ms)
//soal38
// int tinggi = 10;

//         while (true) {

//             // Bergerak dari atas ke bawah
//             for (int i = 0; i < tinggi; i++) {
//                 System.out.print("\033[H\033[2J");
//                 System.out.flush();

//                 for (int j = 0; j < i; j++) {
//                     System.out.println();
//                 }

//                 System.out.println("0");
//                 Thread.sleep(300);
//             }

//             // Bergerak dari bawah ke atas
//             for (int i = tinggi - 2; i >= 0; i--) {
//                 System.out.print("\033[H\033[2J");
//                 System.out.flush();

//                 for (int j = 0; j < i; j++) {
//                     System.out.println();
//                 }

//                 System.out.println("0");
//                 Thread.sleep(300);
//             }
//         }
//soal 39
// int lebar = 30;      // lebar lintasan (jumlah kolom)
//         int bolakBalik = 3;  // berapa kali kiri -> kanan -> kiri

//         System.out.print("\033[2J");    // bersihkan layar
//         System.out.print("\033[?25l");  // sembunyikan kursor

//         for (int putaran = 0; putaran < bolakBalik; putaran++) {

//             // kiri bawah -> kanan bawah
//             for (int posisi = 0; posisi < lebar; posisi++) {
//                 tampilkan(posisi, lebar);
//             }

//             // kanan bawah -> kiri bawah
//             for (int posisi = lebar - 2; posisi >= 0; posisi--) {
//                 tampilkan(posisi, lebar);
//             }
//         }

//         System.out.print("\033[?25h");  // tampilkan kursor lagi
//         System.out.println();
//     }

//     static void tampilkan(int posisi, int lebar) throws InterruptedException {
//         StringBuilder baris = new StringBuilder();
//         for (int i = 0; i < lebar; i++) {
//             baris.append(i == posisi ? '0' : ' ');
//         }

//         // kursor ke baris paling bawah, kolom 1, lalu cetak
//         System.out.print("\033[999;1H" + baris);
//         System.out.flush();
//         Thread.sleep(100);  // kecepatan animasi (ms)
// soal 40
// Bergerak dari atas ke bawah
        // for (int i = 1; i <= 20; i++) {
        //     System.out.println("\n".repeat(i) + " ".repeat(50) + "0");
        //     Thread.sleep(200);
        //     System.out.print("\033[H\033[2J");
        //     System.out.flush();
        // }

        // // Bergerak dari bawah ke atas
        // for (int i = 20; i >= 1; i--) {
        //     System.out.println("\n".repeat(i) + " ".repeat(50) + "0");
        //     Thread.sleep(200);
        //     System.out.print("\033[H\033[2J");
        //     System.out.flush();
        // }
//soal 41
// for (int i = 20; i >= 1; i--) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.println();
//             }

//             System.out.println("0");

//             Thread.sleep(100);
//         }

//         for (int i = 2; i <= 20; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.println();
//             }

//             System.out.println("0");

//             Thread.sleep(100);
//         }
//soal 42
// Scanner scanner = new Scanner(System.in);
        
//         int minimalInput = 10;
//         int jumlahInput = 0;
        
//         // Meminta input pertama untuk inisialisasi nilai terbesar
//         System.out.print("Masukkan angka ke-1: ");
//         int angka = scanner.nextInt();
//         int terbesar = angka;
//         jumlahInput++;

//         // Looping untuk meminta sisa angka (minimal hingga 10 angka)
//         while (jumlahInput < minimalInput) {
//             System.out.print("Masukkan angka ke-" + (jumlahInput + 1) + ": ");
//             angka = scanner.nextInt();

//             // Membandingkan apakah angka baru lebih besar dari nilai terbesar saat ini
//             if (angka > terbesar) {
//                 terbesar = angka;
//             }

//             jumlahInput++;
//         }

//         // Menampilkan hasil
//         System.out.println("\n------------------------------------");
//         System.out.println("Total angka dimasukkan : " + jumlahInput);
//         System.out.println("Bilangan terbesar      : " + terbesar);
//         System.out.println("------------------------------------");

//         scanner.close();
//soal 43
        // Scanner input = new Scanner(System.in);

        // int angka, terkecil;

        // System.out.print("Masukkan jumlah angka (minimal 10): ");
        // int n = input.nextInt();

        // if (n < 10) {
        //     System.out.println("Jumlah angka minimal 10!");
        // } else {
        //     System.out.print("Masukkan angka ke-1: ");
        //     terkecil = input.nextInt();

        //     for (int i = 2; i <= n; i++) {
        //         System.out.print("Masukkan angka ke-" + i + ": ");
        //         angka = input.nextInt();

        //         if (angka < terkecil) {
        //             terkecil = angka;
        //         }
        //     }

        //     System.out.println("Bilangan terkecil adalah: " + terkecil);
        // }

        // input.close();
        //soal 44
        // Scanner input = new Scanner(System.in);

        // int angka, jumlah = 0;

        // System.out.print("Masukkan jumlah angka (minimal 10): ");
        // int n = input.nextInt();

        // if (n < 10) {
        //     System.out.println("Jumlah angka minimal 10!");
        // } else {
        //     for (int i = 1; i <= n; i++) {
        //         System.out.print("Masukkan angka ke-" + i + ": ");
        //         angka = input.nextInt();

        //         if (angka % 2 == 0) {
        //             jumlah++;
        //         }
        //     }

        //     System.out.println("Jumlah bilangan genap adalah: " + jumlah);
        // }

        // input.close();
        //soal 45
        // Scanner input = new Scanner(System.in);

        // int angka, jumlah = 0;

        // System.out.print("Masukkan jumlah angka (minimal 10): ");
        // int n = input.nextInt();

        // if (n < 10) {
        //     System.out.println("Jumlah angka minimal 10!");
        // } else {
        //     for (int i = 1; i <= n; i++) {
        //         System.out.print("Masukkan angka ke-" + i + ": ");
        //         angka = input.nextInt();

        //         if (angka % 2 != 0) {
        //             jumlah++;
        //         }
        //     }

        //     System.out.println("Jumlah bilangan ganjil adalah: " + jumlah);
        // }

        // input.close();
        //soal 46
        // Scanner input = new Scanner(System.in);

        // int n_awal, n_akhir, total = 0;

        // System.out.print("Masukkan n_awal: ");
        // n_awal = input.nextInt();

        // System.out.print("Masukkan n_akhir: ");
        // n_akhir = input.nextInt();

        // for (int i = n_awal; i <= n_akhir; i++) {
        //     if (i > 0) {
        //         total += i;
        //     }
        // }

        // System.out.println("Total bilangan positif = " + total);

        // input.close();
       // soal 47
    //    Scanner input = new Scanner(System.in);

    //     int n_awal, n_akhir, total = 0;

    //     System.out.print("Masukkan n_awal: ");
    //     n_awal = input.nextInt();

    //     System.out.print("Masukkan n_akhir: ");
    //     n_akhir = input.nextInt();

    //     for (int i = n_awal; i <= n_akhir; i++) {
    //         if (i > 0 && i % 2 == 0) {
    //             total += i;
    //         }
    //     }

    //     System.out.println("Total bilangan genap = " + total);

    //     input.close();
    //soal 48
    // Scanner input = new Scanner(System.in);

    //     int n_awal, n_akhir, total = 0;

    //     System.out.print("Masukkan n_awal: ");
    //     n_awal = input.nextInt();

    //     System.out.print("Masukkan n_akhir: ");
    //     n_akhir = input.nextInt();

    //     for (int i = n_awal; i <= n_akhir; i++) {
    //         if (i > 0 && i % 2 != 0) {
    //             total += i;
    //         }
    //     }

    //     System.out.println("Total bilangan ganjil = " + total);

    //     input.close();
    //soal 49
    // Scanner input = new Scanner(System.in);

    //     int n_awal, n_akhir;

    //     System.out.print("Masukkan n_awal: ");
    //     n_awal = input.nextInt();

    //     System.out.print("Masukkan n_akhir: ");
    //     n_akhir = input.nextInt();

    //     System.out.println("Bilangan prima:");

    //     for (int i = n_awal; i <= n_akhir; i++) {
    //         boolean prima = true;

    //         if (i < 2) {
    //             prima = false;
    //         } else {
    //             for (int j = 2; j < i; j++) {
    //                 if (i % j == 0) {
    //                     prima = false;
    //                     break;
    //                 }
    //             }
    //         }

    //         if (prima) {
    //             System.out.print(i + " ");
    //         }
    //     }

    //     input.close();
    //soal 50
    // Scanner input = new Scanner(System.in);

    //     int n_awal, n_akhir, total = 0;

    //     System.out.print("Masukkan n_awal: ");
    //     n_awal = input.nextInt();

    //     System.out.print("Masukkan n_akhir: ");
    //     n_akhir = input.nextInt();

    //     for (int i = n_awal; i <= n_akhir; i++) {
    //         boolean prima = true;

    //         if (i < 2) {
    //             prima = false;
    //         } else {
    //             for (int j = 2; j < i; j++) {
    //                 if (i % j == 0) {
    //                     prima = false;
    //                     break;
    //                 }
    //             }
    //         }

    //         if (prima) {
    //             total += i;
    //         }
    //     }

    //     System.out.println("Total jumlah bilangan prima = " + total);

    //     input.close();
    //soal 51
    // for (int i = 0; i < 6; i++) {

    //        for (int j = 0; j < 5 - i; j++) {
    //            System.out.print("*");
    //       }

    //        for (int j = 0; j < 2 * i - 1; j++) {
    //           System.out.print(" ");
    //         }
    //       for (int j = 0; j < 5 - i; j++) {
    //            System.out.print("*");
    //       }

    //        System.out.println();
    //     }
   // soal 52
  // soal 52 2
    //    for (int i = 1; i <= 6; i++) {

    //        for (int j = 1; j <= 6 - i; j++) {
    //            System.out.print(" ");
    //        }

    //        for (int j = 1; j <= 2 * i - 1; j++) {
    //            System.out.print("*");
    //        }

    //        System.out.println();
    //    }

//        soal 53
    //  for (int i = 1; i <= 6; i++) {

    //        for (int j = 1; j <= (i - 1) % 3 + 1; j++) {
    //            System.out.print("*");
    //        }

    //        System.out.println();
    //    }

//        soal  54
    //  for (int i = 1; i <= 6; i++) {

    //        for (int j = 1; j <= i; j++) {
    //            System.out.print("*");
    //        }

    //        for (int j = 1; j <= 11 - (2 * i); j++) {
    //            System.out.print(" ");
    //        }

    //        for (int j = 1; j <= i; j++) {
    //            System.out.print("*");
    //        }

    //        System.out.println();
    //    }

//        formasi 55
//   for (int i = 1; i <= 6; i++) {

//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }

//            for (int j = 1; j <= 11 - (2 * (i - 1)); j++) {
//                System.out.print("*");
//            }

//            System.out.println();
//        }        

//        formasi 56
    //    for (int i = 1; i <= 6; i++) {

    //        int jumlahBintang = (i - 1) % 3 + 1;

    //        for (int j = 1; j <= jumlahBintang; j++) {
    //            System.out.print("*");
    //        }

    //        System.out.println();
    //    }

//        formasi 57
    //    for (int i = 0; i < 9; i++) {

    //        int jumlahBintang;
    //        int spasi;

    //        if (i <= 4) {
    //            jumlahBintang = 5 - i;
    //            spasi = i;
    //        } else {
    //            jumlahBintang = i - 3;
    //            spasi = 8 - i;
    //        }

    //        for (int j = 0; j < spasi; j++) {
    //            System.out.print(" ");
    //        }

    //        for (int j = 0; j < jumlahBintang; j++) {
    //            System.out.print("*");
    //        }

    //        System.out.println();
    //    }

//        formasi 58
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 6) {
//                for (int j = 1; j <= 11; j++) {
//                    System.out.print("0");
//                }
//            } else {
//                System.out.print("0");
//
//                for (int j = 1; j <= 10; j++) {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//        }

//        formasi 59
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 6) {
//                for (int j = 1; j <= 11; j++) {
//                    System.out.print("0");
//                }
//            } else {
//                for (int j = 1; j <= 10; j++) {
//                    System.out.print("*");
//                }
//
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 60
//        for (int i = 0; i < 9; i++) {
//
//            int bintang;
//
//            if (i <= 2) {
//                bintang = 6 - i;
//            } else {
//                bintang = i - 2;
//            }
//
//            for (int j = 0; j < 6; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < bintang; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        formasi 61
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 1) {
//                for (int j = 1; j <= 11; j++) {
//                    System.out.print("0");
//                }
//            } else {
//                System.out.print("0");
//
//                for (int j = 1; j <= 10; j++) {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//        }
        
//        formasi 62
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 1) {
//                for (int j = 1; j <= 11; j++) {
//                    System.out.print("0");
//                }
//            } else {
//                for (int j = 1; j <= 10; j++) {
//                    System.out.print("*");
//                }
//
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 63
//        for (int i = 1; i <= 6; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("0");
//            }
//
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        formasi 64
//        for (int i = 1; i <= 6; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 65
//      for (int i = 1; i <= 6; i++) {
//
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print("0");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//      }

//        foromasi 66
//      for (int i = 1; i <= 6; i++) {
//
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print("0");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        formasi 67
//        for (int i = 0; i < 6; i++) {
//
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print("0");
//            }
//
//            System.out.print("*");
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 68
//        for (int i = 0; i < 6; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("0");
//            }
//
//            System.out.print("*");
//
//            for (int j = 0; j < 6 - i; j++) {
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 69
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 1 || i == 6) {
//                for (int j = 1; j <= 7; j++) {
//                    System.out.print("0");
//                }
//            } else {
//                System.out.print("0");
//
//                for (int j = 1; j <= 5; j++) {
//                    System.out.print("*");
//                }
//
//                System.out.print("0");
//            }
//
//            System.out.println();
//        }

//        formasi 70
//        for (int i = 1; i <= 6; i++) {
//
//            if (i == 1 || i == 4) {
//                System.out.println("0000000");
//            } 
//            else if (i == 2 || i == 5) {
//                System.out.println("*******");
//            } 
//            else {
//                System.out.println("=======");
//            }
//        }

    }
}
