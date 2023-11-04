package com.javaoop;

// untuk menambahkan field pada class sama dengan membuat variable
// field akan bisa diakses pada class instancenya atau objek dari class
// field ada yang bisa diubah ada yang tidak
// field yang tidak bisa diubah adalah field dengan keyword final
class Person {
  String name;
  String address;
  final int legs = 2;
}

public class ClassField {
  public static void main(String[] args) {
    // contoh penggunaan field
    Person person = new Person();

    person.name = "John"; // memberikan nilai pada fieldnya
    person.address = "Bekasi";

    System.out.println(person.name); // mengakses field pada object
    System.out.println(person.address);
    System.out.println(person.legs);
  }
}
