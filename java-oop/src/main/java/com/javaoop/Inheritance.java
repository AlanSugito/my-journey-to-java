package com.javaoop;

// Class bisa melakukan pewarisan
// pewarisan akan memungkinkan class yang di turunkan akan mempunyai field dan method yang dimiliki class parentnya

class Villain {
  String name;

  void greet() {
    System.out.println("I am " + this.name + "!!!");
  }
}

// class Templar akan mempunyai semua field dan method yang dimiliki class
// Villain kecuali yang bersifat private
class Templar extends Villain {
  Templar(String name) {
    this.name = name;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Templar pazzi = new Templar("Piere de pazzi");
    pazzi.greet(); // greet method yang diturunkan dari class villain
  }
}
