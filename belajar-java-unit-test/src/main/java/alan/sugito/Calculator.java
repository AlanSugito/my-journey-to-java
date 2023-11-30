package alan.sugito;

public class Calculator {

  public Integer divide(Integer first, Integer second) {
    if (second == 0) {
      throw new IllegalArgumentException("Cannot divided by zero!");
    }

    return first / second;
  }

  public Integer add(Integer a, Integer b) {
    return a + b;
  }
}
