package com.javabasic;

public class ForEach {
  public static void main(String[] args) {
    // For each biasa digunakan untuk beroperasi dengan array
    // e.g
    String[] names = { "Alan", "Fakhla", "Ojan", "Nabil" };
    for (var name : names) { // variable name merepresentasikan satu nilai dari array
      System.out.println(name);
    }
  }
}
