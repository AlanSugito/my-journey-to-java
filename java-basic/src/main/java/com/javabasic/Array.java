package com.javabasic;

public class Array {
  public static void main(String[] args) {
    // Array adalah tipe data yang dapat menampung banyak data dengan tipe yang sama
    // array dinotasikan dengan tanda []
    // nilai dari sebuah array bisa diambil dengan menuliskan index yang ingin
    // didapat
    // index array selalu mulai dari 0
    // array panjangnya tetap tidak bisa ditambah tidak bisa dikurang
    // e.g
    String[] hobbies;
    hobbies = new String[3]; // 3 adalah maksimal jumlah data yang bisa ditampung oleh array
    hobbies[0] = "Music"; // memasukan nilai ke index 0
    hobbies[1] = "Sport"; // memasukan nilai ke index 1
    hobbies[2] = "Code"; // memasukan nilai ke index 2
    hobbies[1] = "Gaming"; // menimpa nilai index ke 1
    System.out.println(hobbies[0]);
    System.out.println(hobbies[1]);
    System.out.println(hobbies[2]);

    // cara lain membuat array
    int[] scores = new int[] { 20, 30, 40 }; // otomatis menentukan maksimal jumlah data yang bisa ditampung
    char[] grades = { 'A', 'B', 'C', 'D', 'E' }; // sesuai jumlah data yang dimasukan
    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    System.out.println(grades[0]);
    System.out.println(grades[1]);
    System.out.println(grades[2]);
    System.out.println(grades[3]);
    System.out.println(grades[4]);

    // kita bisa melihat panjang data sebuah array dengan properti length
    System.out.println(grades.length);

    // kita juga bisa membuat array 2 dimensi yaitu array didalam array
    String[][] twoDimensionalArray = {
        { "John", "doe" },
        { "Foo", "Bar" }
    };

    // cara mengaksesnya seperti berikut
    System.out.println(twoDimensionalArray[0][1]); // hasilnya doe
    System.out.println(twoDimensionalArray[1][0]); // hasilnya foo
  }
}
