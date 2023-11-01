package com.javabasic;

public class DoWhile {
  public static void main(String[] args) {
    // do while adalah variasi dari while loop
    // dimana program akan dijalankan terlebih dahulu sebelum dicek kondisinya
    // program akan dijalankan setidaknya satu kali
    // e.g

    int i = 0;
    do {
      System.out.println("Perulangan ke - " + (i + 1));
      i++;
    } while (i < 10);
  }
}
