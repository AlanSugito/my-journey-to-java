import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {
    // Gunakan StringTokenizer untuk memotong motong string
    StringTokenizer tokenizer = new StringTokenizer("Dizz Nutz", " ");

    while (tokenizer.hasMoreTokens()) {
      var result = tokenizer.nextToken();
      System.out.println(result);
    }
  }
}
