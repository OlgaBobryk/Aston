package src.test.java;

public class FactorialOfNumber {
    public int getFactorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        }
    }
}