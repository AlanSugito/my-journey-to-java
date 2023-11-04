package com.applications;

import com.data.Product;

public class ProductApplication {
  public static void main(String[] args) {
    Product product = new Product("lenovo");
    System.out.println(product.name); // field name bisa diaccess dimana saja karena bersifat public
    // product.review(); method review tidak bisa diakses karena bersifat protected,
    // artinya tidak bisa diakses jika packagenya berbeda
    // product.calcuate(); method calculate tidak bisa diakses karena bersifat
    // private
    // product.showCalculate(); method showCalculate tidak bisa diakses karena tidak
    // memiliki modifier
  }
}
