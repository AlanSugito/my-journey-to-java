import java.util.StringJoiner;

public class StringJoinerApp {
  public static void main(String[] args) {
    // gunakan StringJoiner untuk menggabung gabungkan string dengan delimiter dan
    // prefix dan suffixnya
    StringJoiner joiner = new StringJoiner(",", "[", "]");

    joiner.add("Joe");
    joiner.add("Mama");
    joiner.add("Dizz");
    joiner.add("nut");

    var result = joiner.toString();
    System.out.println(result);

  }
}
