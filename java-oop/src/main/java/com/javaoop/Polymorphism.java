package com.javaoop;

// Polymorphism adalah kemampuan class untuk menjadi class lain yang masih satu keturunan

class Employee {
  String name;

  Employee(String name) {
    this.name = name;
  }

  void sayHello() {
    System.out.println("Hi, this is employee");
  }
}

class Manager extends Employee {
  Manager(String name) {
    super(name);
  }

  void sayHello() {
    System.out.println("Hi, this is Manager");
  }

  void guide() {
    System.out.println("I'm guiding my staff");
  }
}

class VicePresident extends Manager {
  VicePresident(String name) {
    super(name);
  }

  void sayHello() {
    System.out.println("Hi, this is Vice President");
  }
}

public class Polymorphism {

  public static void main(String[] args) {
    // contoh polymorphism
    Employee employee = new Employee("Budi"); // variable diawali sebagai object Employee
    employee.sayHello();
    saySomething(employee);

    employee = new Manager("Budi"); // variable employee bisa diubah menjadi object Manager, karena Manager masih
    // satu keturunan dengan class Employee
    // namun variable employee hanya bisa mengakses method dan field yang sama
    // dengan class saat variable dibuat
    employee.sayHello(); // bisa mengakses method sayHello karena class Manager juga mempunyai method
    saySomething(employee);
    // sayHello
    // employee.guide(); method guide tidak bisa diakses karena class Employee tidak
    // memiliki method guide
    employee = new VicePresident("Budi"); // employee juga bisa diubah menjadi object vice president karena masih satu
    // keturunan dengan object employee
    System.out.println(employee.name);
    saySomething(employee);
    // note: penggantian nilai variable diatas tidak sepenuhnya berganti
    // nilai yang baru hanya dianggap sebagai tipe data yang sama tidak merubah tipe
    // datanya
    // untuk mengubah tipe datanya bisa melakukan konversi nilai dengan menggunakan
    // type checking

  }

  // Kita juga bisa melakukan type checking jika kita ingin mengkonversi nilai
  // dari variable
  // type checking bisa dilakukan dengan keyword instanceof dan akan menghasilkan
  // data boolean
  // e.g

  static void saySomething(Employee employee) { // outputnya akan berbeda tergantung tipe datanya
    if (employee instanceof VicePresident) {
      VicePresident vp = (VicePresident) employee; // mengkonversi tipe data setelah type checking
      vp.sayHello();
      return;
    }

    if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      manager.guide(); // sekarang bisa menggunakan method guide karena tipe datanya sepenuhnya telah
                       // diubah
      return;
    }

    employee.sayHello();
  }
}