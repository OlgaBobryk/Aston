package src.test.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialOfNumberTest {

    @Test
    public void factorialOfNumber() {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        factorialOfNumber.getFactorial(0);
        Assert.assertEquals(factorialOfNumber.getFactorial(0), 0, "Значения не равны");
    }
}
