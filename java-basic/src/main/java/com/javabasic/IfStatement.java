package com.javabasic;

public class IfStatement {
  public static void main(String[] args) {
    // if statement adalah sebuah statement untuk membuat sebuah pengkondisian
    // if bisa disambung dengan else if jika kondisi sebelumnya tidak terpenuhi
    // lalu bisa disambung dengan else jika semua kondisi tidak terpenuhi

    int a = 10;
    int b = 5;

    if (a == 10) {
      System.out.println("program jalan karena kondisinya benar");
    } else if (a > b) {
      System.out.println("Kondisi kedua jika kondisi diatas salah");
    } else {
      System.out.println("jika semua kondisi tidak terpenuhi");
    }

  }
}
