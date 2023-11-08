package com.applications;

import com.interfaces.HelloWorld;

public class AnonymousClassApplication {
  public static void main(String[] args) {
    // kita bisa membuat anonymous class
    // yaitu class yang hanya bisa sekali pakai
    // syaratnya harus mempunyai interface sesuai object yang ingin dibuat
    // e.g

    HelloWorld helloWorld1 = new HelloWorld() { // classnya langsung dibuat di variable, nama classnya menyesuaikan
                                                // interfacenya
      @Override
      public void sayHello() {
        System.out.println("Hello world");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    helloWorld1.sayHello();
    helloWorld1.sayHello("John");
  }
}
