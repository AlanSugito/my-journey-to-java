package com.javabasic;

public class WhileLoop {
  public static void main(String[] args) {
    // selain for loop kita juga bisa menggunakan while loop
    // while loop hanya memerlukan kondisi untuk melakukan perulangan
    // e.g
    int i = 0;
    while (i < 10) {
      System.out.println("Perulangan ke - " + (i + 1));
      i++; // jangan lupa untuk menambahkan post statement, supaya tidak terjadi infinite
           // loop
    }
  }
}
