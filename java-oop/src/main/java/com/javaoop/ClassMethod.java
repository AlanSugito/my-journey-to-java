package com.javaoop;

// class juga bisa memiliki method/function 
// untuk mengakses method perlu membuat objek dari kelasnya terlebih dahulu
// untuk mengakses method/function sama dengan mengakes field
// untuk mengakes field pada method bisa dengan menggunakan keyword this
// this merujuk pada object itu sendiri

class Car {
  String brand;
  String name;

  void startEngine() {
    System.out.println("Car engine is ready!");
  }

  void move(int km) {
    System.out.println("Car moved " + 2 + "km");
  }

  String getName() {
    return this.name;
  }
}

public class ClassMethod {
  public static void main(String[] args) {
    Car avanza = new Car();

    avanza.startEngine(); // pemanggilan method
    avanza.move(3);

    String carName = avanza.getName();
    System.out.println(carName);
  }
}
