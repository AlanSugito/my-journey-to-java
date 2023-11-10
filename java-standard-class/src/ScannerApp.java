import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {
    // Gunakan class Scanner untuk menerima input dari terminal ataupun dari file

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nama: ");
    String name = scanner.nextLine();
    scanner.close();

    System.out.println("Hello, " + name);
  }
}
