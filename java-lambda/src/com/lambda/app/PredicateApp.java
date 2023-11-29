package app;

import java.util.function.Predicate;

import utils.StringUtil;

public class PredicateApp {
  public static void main(String[] args) {
    // it's called method reference
    // with static method
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Alan"));
    System.out.println(predicateIsLowerCase.test("alan"));
  }

  public void run() {
    // with not static method
    Predicate<String> predicateIsLowerCase = this::isLowerCase;
    System.out.println(predicateIsLowerCase);

  }

  public boolean isLowerCase(String s) {
    for (var c : s.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
      ;
    }

    return true;
  }
}
