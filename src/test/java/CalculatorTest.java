import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator calculator = new Calculator();

    // Tests for square root.
    @Test
    public void squareRootTruePositive(){
        assertEquals("Calculating square root for true positive", 5, calculator.squareRoot(25), delta);
        assertEquals("Calculating square root for true positive", 14, calculator.squareRoot(196), delta);
    }
    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Calculating square root for false positive", 6, calculator.squareRoot(20), delta);
        assertNotEquals("Calculating square root for false positive", 11, calculator.squareRoot(76), delta);
    }

    // Tests for factorial.
    @Test
    public void factorialTruePositive(){
        assertEquals("Calculating factorial for true positive", 120, calculator.factorial(5), delta);
        assertEquals("Calculating factorial for true positive", 5040, calculator.factorial(7), delta);
    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Calculating factorial for false positive", 16, calculator.factorial(4), delta);
        assertNotEquals("Calculating factorial for false positive", 200, calculator.factorial(6), delta);
    }

    // Tests for natural logarithm.
    @Test
    public void naturalLogarithmTruePositive(){
        assertEquals("Calculating natural logarithm for true positive", 0, calculator.naturalLogarithm(1), delta);
        assertEquals("Calculating natural logarithm for true positive", Double.NaN, calculator.naturalLogarithm(-3),
                delta);
    }
    @Test
    public void naturalLogarithmFalsePositive(){
        assertNotEquals("Calculating square root for false positive", 1.25, calculator.naturalLogarithm(18), delta);
        assertNotEquals("Calculating square root for false positive", 3.2, calculator.naturalLogarithm(56), delta);
    }

    // Tests for exponentiation.
    @Test
    public void exponentiationTruePositive(){
        assertEquals("Calculating power for true positive", 25, calculator.exponentiation(5, 2), delta);
        assertEquals("Calculating power for true positive", 343, calculator.exponentiation(7, 3), delta);
    }
    @Test
    public void exponentiationFalsePositive(){
        assertNotEquals("Calculating power for false positive", 5, calculator.exponentiation(2, 3), delta);
        assertNotEquals("Calculating power for false positive", 50, calculator.exponentiation(8, 3), delta);
    }
}
