import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialOfNumberTest {
    @Test
    public void factorialOfNumber() {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        Assert.assertEquals(factorialOfNumber.getFactorial(5), 120, "Значения не равны");
    }
}
