public class StringBuilderApp {
  public static void main(String[] args) {
    // Pakai StringBuilder class daripada String, untuk optimasi memory

    StringBuilder builder = new StringBuilder("Hello");

    builder.append(" "); // gunakan method add untuk menambah string baru
    builder.append("World");

    System.out.println(builder.toString()); // gunakan method toString untuk melihat hasilnya
  }
}
