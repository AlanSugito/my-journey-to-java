package com.javabasic;

public class Method {
  public static void main(String[] args) {
    // Method/function adalah satu blok baris kode yang bisa digunakan dengan cari
    // dipanggil
    // method bisa memiliki parameter sebanyak yang dibutuhkan
    // method juga bisa mengembalikan sebuah nilai
    // kita bisa membuat method dengan nama yang sama tapi dengan argument yang
    // berbeda, disebut method overloading

    // pemanggilan method/function
    printName();
    printName("Alan");
    printOneTo(1, 2, 3, 4, 5, 6);
    int ten = getNumberTen();
    int factorialTen = factorial(ten);
    System.out.println(factorialTen);

  }

  // e.g
  // method tanpa parameter
  static void printName() {
    System.out.println("name printed");
  }

  // method dengan parameter sekaligus method overloading
  static void printName(String name) {
    System.out.println("Namanya " + name);
  }

  // method dengan argument variable, argument variable hanya boleh ditulis di
  // urutan terakhir dan akan dianggap sebagai array

  static void printOneTo(int... nums) {
    for (var num : nums) {
      System.out.println(num);
    }
  }

  // method yang mengembalikan nilai
  static int getNumberTen() {
    return 10;
  }

  // adapun recursive method, yaitu method yang memanggil method itu sendiri
  static int factorial(int value) {
    if (value == 1) {
      return value;
    }

    return value * factorial(value - 1);
  }

}
