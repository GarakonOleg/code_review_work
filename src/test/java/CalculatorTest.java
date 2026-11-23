import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    int actual = 0;
    int a = 0;
    int b = 0;


    @Test
    void add() {
        actual = calculator.add(5,2);
        assertEquals(7, actual);
    }

    @Test
    void dif() {
        actual = calculator.dif(5,2);
        assertEquals(3, actual);
    }

    @Test
    void div() {
        actual = calculator.div(8,2);
        assertEquals(4, actual);
    }

    @Test
    void times() {
        actual = calculator.times(5,2);
        assertEquals(10, actual);
    }

    @Test
    void solver() {
        assertEquals(50, calculator.solver());
    }
}