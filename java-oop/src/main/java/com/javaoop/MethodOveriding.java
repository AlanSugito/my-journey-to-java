package com.javaoop;

// Method overiding merupakan kemampuan child class menimpa method yang sudah ada pada parent class
// meskipun begitu kita masih tetap bisa memanggil method parentnya menggunakan keyword super
// keyword super juga bisa untuk memanggil field atau constructor dari class parentnya

class Motorbike {
  Integer tires;
  String color;

  Motorbike(String color) {
    this.tires = 2;
    this.color = color;
  }

  void clarckSound() {
    System.out.println("Beepp");
  }
}

class Beat extends Motorbike {

  Beat() {
    super("Red");
    // memanggil constructor parent classnya
    // jika constructor parentnya mempunyai parameter maka super constructor wajib
    // dipanggil
    // constructor parent hanya bisa dipanggil pada child class constructornya
  }

  // method clarcksound Motorbuke ditimpa di class Beat yang merupakan child
  // classnya
  void clarckSound() {
    super.clarckSound(); // memanggil method clarcksound dari class Motorbike
    System.out.println("Tiiit");
  }
}

public class MethodOveriding {
  public static void main(String[] args) {
    Beat beat = new Beat();
    beat.clarckSound();
  }
}
