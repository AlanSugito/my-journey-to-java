package com.javaoop;

// sama seperti method, constructor juga bisa melakukan overloading
// constructor juga bisa dipanggil di constructor lain

class Hero {
  String name;
  Integer HP;

  Hero(String name) {
    this.name = name;
  }

  Hero(Integer hp) {
    this.HP = hp;
  }

  Hero(String name, Integer hp) {
    this(name); // memanggil constructor pertama
    // hanya bisa memanggil satu constructor dan dipaling atas
    this.HP = hp;
  }

}

public class ContstuctorOverloading {
  public static void main(String[] args) {
    Hero assasin = new Hero("Ezio Auditore"); // menggunakan constructor pertama
    Hero tank = new Hero(10000); // menggunakan constructor kedua
    Hero mage = new Hero("Cyclop", 4000); // menggunakan constructor ketiga

    System.out.println(assasin.name);
    System.out.println(tank.HP);
    System.out.println(mage.name + " " + mage.HP);
  }
}
