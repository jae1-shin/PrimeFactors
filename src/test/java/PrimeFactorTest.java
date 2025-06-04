import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    PrimeFactor primefactor;

    @BeforeEach
    void setUp() {
        primefactor = new PrimeFactor();
    }

    @Test
    public void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primefactor.of(1));
    }

    @Test
    public void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primefactor.of(2));
    }

    @Test
    public void testPrimeFactorOf3() {
        assertEquals(Arrays.asList(3), primefactor.of(3));
    }

    @Test
    public void testPrimeFactorOf4() {
        assertEquals(Arrays.asList(2,2), primefactor.of(4));
    }
}