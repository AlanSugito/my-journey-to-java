package app;

import java.util.function.Supplier;

public class LazyApp {
  public static void main(String[] args) {
    // getName method will be called
    testScore(90, () -> getName());
    // getName method will not be called
    testScore(60, () -> getName());
  }

  public static void testScore(Integer score, Supplier<String> name) {
    if (score >= 90) {
      System.out.println("Congratulations " + name.get() + " you are passed");
    } else {
      System.out.println("Better luck next time!");
    }
  }

  public static String getName() {
    System.out.println("Hey buddy!");
    return "Alan";
  }
}
