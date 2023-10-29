package com.javabasic;

public class Variable {
  public static void main(String[] args) {
    // Variable adalah tempat untuk menyimpan sebuah nilai, bukan menamai ulang!
    // Variable hanya bisa menampung 1 tipe data, tidak bisa diubah ubah tipe
    // datanya
    // variable bisa langsung di masukan nilai ataupun tidak, kecuali menggunakan
    // keyword var nilainya harus langsung dimasukan
    // contoh variable

    String name; // nilainya tidak langsung dimasukan
    name = "Alan"; // nilainya baru dimasukan
    // name = 10 akan error karna memasukan nilai yang bukan string
    System.out.println(name); // outputnya alan
    // Variable bisa ditimpa nilainya asalkan tipe datannya sama
    name = "Sugito";
    System.out.println(name); // outputny sugito

    // Variable juga bisa menggunakan keyword var
    // keyword var harus langsung dimasukan nilai
    var age = 10; // tipe datanya akan langsung di tentukan sesuai nilai yang diberikan
    // var address; akan error karena harus ada nilai yang dimasukan
    System.out.println(age);

    // Kita juga bisa membuat variable konstanta yaitu variable yg tidak bisa diubah
    // nilainya
    // membuat konstanta bisa menggunakan keyword final sebelum pendeklarasian
    // variable
    // e.g

    final double PHI = 3.14;
    // PHI = 2; akan error karena nilainya sudah tetap tidak bisa ditimpa
    System.out.println(PHI);

  }
}
