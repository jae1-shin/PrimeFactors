import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void test() {
        assertEquals(10, 10);
    }

    @Test
    public void testPrimeFactorOf1() {
        PrimeFactor primefactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primefactor.of(1));
    }

    @Test
    public void testPrimeFactorOf2() {
        PrimeFactor primefactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primefactor.of(2));
    }
}