package com.javabasic;

public class LogicOperator {
  public static void main(String[] args) {
    // Operator logika adalah operator untuk membandingkan 2 nilai boolean atau
    // lebih
    // ada 2 operator yang bisa dipakai yaitu && dibaca and, || dibaca or, ! dibaca
    // not
    // operator ini akan menghasilkan data boolean
    // e.g

    System.out.println(true && true); // hasilnya akan true karena dua duanya true
    System.out.println(true && false); // hasilnya akan false karena salah satunya false
    System.out.println(true || true); // hasilnya akan true karena dua duanya true
    System.out.println(false || true); // hasilnya akan true karena salah satunya true
    System.out.println(false || false); // hasilnya akan false karena dua duanya false
    System.out.println(!true); // hasilnya false karena ! adalah nilai kebalikannya

  }
}
