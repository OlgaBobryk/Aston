import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    @DisplayName("Факториал числа")
    @RepeatedTest(2)

    public void factorialOfNumber() {
        Factorial factorialOfNumber = new Factorial();
        Assertions.assertEquals(120, factorialOfNumber.getFactorial(5), "Значения отличаются");
    }
}
