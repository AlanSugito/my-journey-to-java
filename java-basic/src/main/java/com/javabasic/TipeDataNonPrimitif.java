package com.javabasic;

public class TipeDataNonPrimitif {
  public static void main(String[] args) {
    // number, char, boolean adalah tipe data primitif
    // namun ada juga versi tipe data non primitifnya
    // tipe data non primitif memiliki default value null
    // contoh tipe data non Primitif = Integer, Float, String, Character, Boolean
    // tipe data non primitif akan mengkonversi tipe data primitif menjadi sebuah
    // object yang memiliki method/function
    // e.g
    String name = "Alan";
    Integer age = 20;
    Boolean sudahMenikah = false;

    // tipe data non primitif juga bisa dikonversi menjadi tipe data primitif
    // menggunakan methodnya masing masing
    // e.g
    int umur = age.intValue();
    double umur2 = age.doubleValue();

    System.out.println(name);
    System.out.println(age);
    System.out.println(sudahMenikah);
    System.out.println(umur);
    System.out.println(umur2);

  }
}
