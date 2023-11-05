package com.javaoop;

// di java ada yang namanya abstract class
// yaitu class yang tidak bisa dijadikan sebagai object
// abstract class hanya bisa menjadi parent class, artiny hanya untuk di extends pada class lain
// abstract class biasanya hanya menjadi sebuah kontrak untuk sebuah class
// selain abstract class ada juga abstract method
// yaitu method yang harus di override di child classnya

abstract class Creature {
  Integer legs;

  abstract void eat(); // abstract method

  void fly() { // method yang bukan abstract bisa dipanggil di child classnya begitu juga
               // dengan field
    System.out.println("I'am flying");
  }

}

class Bird extends Creature {
  Integer legs;

  void eat() {
    super.fly();
    System.out.println("nyam nyam");
  }

}

public class Abstract {
  public static void main(String[] args) {
    // Animal animal = new Animal(); ini akan error karena abstract class tidak bisa
    // di jadikan object
    Creature eagle = new Bird();
    eagle.legs = 2;
    eagle.eat();
  }
}
