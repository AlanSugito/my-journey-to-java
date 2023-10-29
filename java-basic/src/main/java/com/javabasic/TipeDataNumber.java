package com.javabasic;

public class TipeDataNumber {
  public static void main(String[] args) {
    // Tipe data number
    byte iniByte = 10; // range nilai yang bisa ditampung tipe data byte adalah -128 - 127, byte
                       // berukuran 1 byte = 8bit
    short iniShort = 1000; // range nilai yang bisa ditampung tipe data short adalah -32.768 - 32.767,
                           // short berukuran 2 byte = 16 bit
    int iniInteger = 10000; // range nilai yang bisa ditampung tipe data integer adalah -2.147.483.648 -
                            // 2.147.483.647, integer
                            // berukuran 4 byte = 32 bit
    long iniLong = 1000000; // range nilai yang bisa ditampung tipe data long adalah
                            // -9.223.372.036.854.775.808 - 9.223.372.036.854.775.807, long
                            // berukuran 8 byte = 64 bit
    long iniLong2 = 100000L; // long juga bisa ditulis dengan format seperti ini, keyword L hanya untuk
                             // menandakan bahwa itu adalah tipe data long

    // Tipe data floating point a.k.a desimal
    float iniFloat = 10.10F; // range nilai yang bisa ditampung tipe data float adalah -3.4e-038 - 3.4e+038,
                             // float
                             // berukuran 4 byte = 32 bit
                             // e = pangkat 10
    double iniDouble = 10.100; // range nilai yang bisa ditampung tipe data double adalah -1.7e-308 - 1.7e+308,
                               // double
                               // berukuran 8 byte = 32 bit

    // Kita juga bisa memisahkan nomor dengan tanda _ e.g = 1_000, 10_000, 100_000,
    // 1_000_000

    // kita bisa menulis nilai integer dengan literal seperti decimal, hex atau
    // binary
    // e.g
    int iniDecimal = 25;
    int iniHex = 0xFFFFFF; // 0x adalah prefix untuk menyatakan hexadesimal
    int iniBinary = 0b0101010; // 0b adalah prefix untuk menyatakan binary

    // kita bisa mengkonversi tipe data secara otomatis
    byte awalnyByte = 10;
    short jadiShort = awalnyByte;

    // kita juga bisa mengkonversi tipe data secara manual
    // e.g
    double awalnyaDouble = 10.5;
    int jadiInteger = (int) awalnyaDouble;

    System.out.println(iniByte);
    System.out.println(iniShort);
    System.out.println(iniInteger);
    System.out.println(iniLong);
    System.out.println(iniLong2);
    System.out.println(iniFloat);
    System.out.println(iniDouble);
    System.out.println(iniDecimal);
    System.out.println(iniHex);
    System.out.println(iniBinary);
    System.out.println(awalnyByte);
    System.out.println(jadiShort);
    System.out.println(awalnyaDouble);
    System.out.println(jadiInteger);
  }
}
