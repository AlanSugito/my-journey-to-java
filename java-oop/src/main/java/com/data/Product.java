package com.data;

// class, method, dan field mempunyai access modifier yaitu
// public, protected, private, dan no modifier (default)
// public mengizinkan class, method, field diakses di semua class(file), subclass, dan package
// dalam satu class hanya boleh ada satu public class
// potected hanya mengizinkan class, method, field diakses pada class(file) dan subclass dalam satu package
// private hanya mengizinkan class, method, field diakses pada class itu sendiri saja tidak bisa diakses oleh class, subclass, ataupun package
// no modifier hanya mengizinkan class, method, field diakses pada class dan subclassnya saja, tidak bisa diakses pada file berbeda walaupun di package yang sama
// note: selalu tambahkan access modifier bahkan pada constructor
public class Product {
  public String name;

  public Product(String name) {
    this.name = name;
  }

  protected void review() {
    System.out.println("Review");
  }

  private void calculate() {
    System.out.println("Calculate");
  }

  void showCalculate() {
    this.calculate();
  }

}
