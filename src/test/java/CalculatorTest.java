import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(-2, calculator.dif(3, 5));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
    }

    @Test
    void times() {
        assertEquals(12, calculator.times(3, 4));
    }

    @Test
    void solver() {
        assertEquals(3, calculator.solver());
    }
}