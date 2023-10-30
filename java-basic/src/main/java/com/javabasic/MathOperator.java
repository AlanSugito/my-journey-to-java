package com.javabasic;

public class MathOperator {
  public static void main(String[] args) {
    // kita bisa melakukan operasi matematika seperti tambah, kurang, bagi, kali
    // dan modulus
    // operatornya adalah sebagai berikut: +, -, /, *, %

    int operand1 = 20;
    int operand2 = 40;

    System.out.println(operand1 + operand2);
    System.out.println(operand2 - operand1);
    System.out.println(operand2 / operand1);
    System.out.println(operand1 * operand2);
    System.out.println(operand1 % 2);

    // kita juga bisa melakukan augmented assignment
    // yaitu memasukan nilai pada variable hasil dari operasi matematika variable
    // itu sendiri dengan menambahkan = setelah operator
    // e.g
    int a = 20;
    a += 10;
    // akan sama dengan
    a = a + 10;
    // begitupun dengan operator lain
    System.out.println(a);

    // adapun operator unary
    // sama dengan augmented assignment namun operator unary hanya dioperasikan
    // dengan angka 1
    // yaitu dengan cara menuliskan operatornya 2kali
    // e.g
    int num = 1;
    num++;
    // akan sama dengan
    num = num + 1;
    // atau
    num--;
    // akan sama dengan
    num = num - 1;
    // kita juga bisa mendapatkan kebalikan dari nilai boolean dengan operator !
    // e.g
    boolean isNotTrue = !true; // hasilnya false
    System.out.println(num);
    System.out.println(isNotTrue);
  }
}
