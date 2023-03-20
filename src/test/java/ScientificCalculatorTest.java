import org.example.ScientificCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ScientificCalculatorTest {

    private static final double DELTA = 1e-15;
    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    public void factorialTruePositive() {
        assertEquals("Factorial of a number for True Positive", 120, calculator.findFactorial(5));
        assertEquals("Factorial of a number for True Positive",479001600 , calculator.findFactorial(12));
        assertEquals("Factorial of a number for True Positive", 3628800, calculator.findFactorial(10));
        assertEquals("Factorial of a number for True Positive", 720, calculator.findFactorial(6));
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Factorial of a number for True Negative", 163, calculator.findFactorial(5));
        assertNotEquals("Factorial of a number for True Negative", 69, calculator.findFactorial(5));
        assertNotEquals("Factorial of a number for True Negative", 6, calculator.findFactorial(2));
        assertNotEquals("Factorial of a number for True Negative", 402, calculator.findFactorial(10));
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Square root for True Positive", 11, calculator.findSquareRoot(121), DELTA);
        assertEquals("Square root for True Positive", 5, calculator.findSquareRoot(25), DELTA);
        assertEquals("Square root for True Positive", 8, calculator.findSquareRoot(64), DELTA);
        assertEquals("Square root for True Positive", 14, calculator.findSquareRoot(196), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Square root for True Negative", 69, calculator.findSquareRoot(3), DELTA);
        assertNotEquals("Square root for True Negative", 759, calculator.findSquareRoot(11), DELTA);
        assertNotEquals("Square root for True Negative", 869, calculator.findSquareRoot(10), DELTA);
        assertNotEquals("Square root for True Negative", -42, calculator.findSquareRoot(6), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Power for True Positive", 16, calculator.findPower(2, 4), DELTA);
        assertEquals("Power for True Positive", 27, calculator.findPower(3, 3), DELTA);
        assertEquals("Power for True Positive", 1024, calculator.findPower(2, 10), DELTA);
        assertEquals("Power for True Positive", 25, calculator.findPower(5, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Power for True Negative", 10, calculator.findPower(2, 2), DELTA);
        assertNotEquals("Power for True Negative", 509, calculator.findPower(4, 5), DELTA);
        assertNotEquals("Power for True Negative", 978, calculator.findPower(7, 3), DELTA);
        assertNotEquals("Power for True Negative", -69420, calculator.findPower(-12, 5), DELTA);
    }


    @Test
    public void naturalLogTruePositive() {
        assertEquals("Natural log for True Positive", 0, calculator.findNaturalLog(1), DELTA);
        assertEquals("Natural log for True Positive", 4.02535169073515, calculator.findNaturalLog(56), DELTA);
        assertEquals("Natural log for True Positive", 1.9459101490553132, calculator.findNaturalLog(7), DELTA);
        assertEquals("Natural log for True Positive", 5.703782474656201, calculator.findNaturalLog(300), DELTA);
    }

    @Test
    public void naturalLogTrueNegative() {
        assertNotEquals("Natural log for True Negative", 9, calculator.findNaturalLog(2.4), DELTA);
        assertNotEquals("Natural log for True Negative", 1, calculator.findNaturalLog(3.10), DELTA);
        assertNotEquals("Natural log for True Negative", 10, calculator.findNaturalLog(5), DELTA);
        assertNotEquals("Natural log for True Negative", 421, calculator.findNaturalLog(2.1), DELTA);
    }
}
