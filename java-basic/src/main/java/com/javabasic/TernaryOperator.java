package com.javabasic;

public class TernaryOperator {
  public static void main(String[] args) {
    // Ternary operator adalah sebuah shorthand untuk if statement
    // ternary operator hanya bisa 2 kondisi yaitu if dan else
    // nilai pertama setelah tanda tanya adalah jika kondisi true dan yang kedua
    // adalah ketika kondisinya false
    // e.g
    int nilai = 10;
    char grade = nilai > 10 ? 'A' : 'B'; // grade akan berisi B

    System.out.println(grade);
  }
}
