package com.javabasic;

public class ForLoop {

  public static void main(String[] args) {
    // kita bisa melakukan perulangan dengan for loop
    // for bisa ditulis sebagai berikut
    // for (init statement; kondisi; post statement) {
    // baris kode yang ingin diulang
    // }
    // init statement adalah kode yang akan dijalankan hanya saat perulangan baru
    // dimulai
    // post statement adalah kode yang akan dijalankan hanya di akhir kode yang
    // dijalankan
    // e.g
    for (int i = 0; i < 10; i++) {
      System.out.println("perulangan ke - " + (i + 1));
    }

    // jika kita tidak memasukan init statement dll ataupun salah memasukan kondisi,
    // maka bisa terjadi infinite loop
    // perulangan tidak akan berhenti jadi hati-hati

    // kita juga bisa menggunakan keyword break dan continue untuk mengendalikan
    // alur perulangan
  }

}
