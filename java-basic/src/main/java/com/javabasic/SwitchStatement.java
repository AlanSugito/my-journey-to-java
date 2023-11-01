package com.javabasic;

public class SwitchStatement {
  public static void main(String[] args) {
    // Switch adalah pengkondisian dengan kondisi yang sederhana yaitu ==
    // e.g

    String name = "Alan";

    switch (name) {
      case "Agus":
        System.out.println("Hi, Agus");
        break; // keyword break untuk memberhentikan statement agar case selanjutnya tidak
               // dieksekusi
      case "Alan":
      case "alan": // jika ingin menambahkan 2 kondisi
        System.out.println("Hi, Alan");
        break;
      default: // default sama dengan else, yaitu akan dijalankan jika case diatas tidak ada
               // yang true
        System.out.println("Gk ada namanya");
        break;
    }

    // kita juga bisa menggunakan switch lambda, yaitu statement switch yang lebih
    // ringkas
    // hanya berjalan di java 14 keatas
    // e.g
    int score = 10;
    switch (score) {
      case 10 -> System.out.println("nilainya D"); // jika hanya ada satu baris untuk dieksekusi
      case 20, 30 -> System.out.println("nilainya B"); // jika ada dua kondisi
      default -> { // gunakan {} jika ada lebih dari 1 baris untuk dieksekusi
        System.out.println("nilainya E");
        System.out.println("Coba lagi!");
      }
    }
    // kita juga bisa menggunakan keyword yield untuk mengembalikan nilai
    // e.g
    char grade = switch (score) {
      case 80:
        yield 'A';
      case 70:
        yield 'B';
      default:
        yield 'C';
    };

    System.out.println("Nilai anda: " + grade); // outputnya C
  }

}
