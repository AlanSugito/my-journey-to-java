package com.javaoop;

// Constructor adalah method yang dipanggil saat pembuatan object

// Constructor ditulis dengan nama kelas lalu dibuat seperti method biasa
// sama seperti method, constructor bisa memiliki parameter sebanyak yang dibutuhkan
// memasukan argument pada constructor dapat dilakukan pada tanda () saat pembuatan object

class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void sayGoodBye() {
    System.out.println("lo siento!!" + " " + this.name);
  }
}

public class ClassConstructor {
  public static void main(String[] args) {
    Animal rooster = new Animal("Wilson"); // pembuatan object
    System.out.println(rooster.name); // field name akan otomatis terisi
    rooster.sayGoodBye();
  }
}
