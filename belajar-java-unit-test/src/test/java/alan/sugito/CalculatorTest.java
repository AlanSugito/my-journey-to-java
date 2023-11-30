package alan.sugito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Tes object calculator")
public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  @DisplayName("Tes skenario sukses method add")
  public void testAddSuccess() {
    var result = calculator.add(10, 10);

    assertEquals(20, result);
  }

  @Test
  @DisplayName("Tes skenario sukses method divide")

  public void testDivideSuccess() {
    var result = calculator.divide(100, 10);

    assertEquals(10, result);
  }

  @Test
  @DisplayName("Tes skenario gagal method divide")
  @Disabled
  public void testDivideFail() {
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
  }
}
