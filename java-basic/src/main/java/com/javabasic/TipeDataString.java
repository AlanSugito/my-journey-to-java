package com.javabasic;

public class TipeDataString {
  public static void main(String[] args) {
    // Tipe data string merupakan tipe data berupa teks yang ditulis dengan format
    // "{nilai}" berbeda dengan char yg menggunakan ''
    // string bisa lebih dari satu karakter

    String firstName = "Alan";
    String lastName = "Sugito";

    System.out.println(firstName);
    System.out.println(lastName);

    // Kita bisa menggabungkan beberapa string dengan operator +
    // e.g
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
  }
}
