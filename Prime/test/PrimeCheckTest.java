import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeCheckTest {
    // Überprüft, ob eine Zahl eine Primzahl ist
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // --------------------------------------------------------------- //
    @Test
    public void TestNegativeNumbers() {
        for (int i = -10; i < 0; ++i) {
            assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
        }
    }

    // --------------------------------------------------------------- //
    @Test
    public void TestEdgeCases() {
        assertEquals("Test 0", false, PrimeCheck.isPrime(0));
        assertEquals("Test 1", false, PrimeCheck.isPrime(1));
        assertEquals("Test 2", true, PrimeCheck.isPrime(2));
    }
    // --------------------------------------------------------------- //
    @Test
    public void testPrimes() {
        /* ToDo: insert a test here */
        int n = 50; // Anzahl der Primzahlen, die ausgegeben werden sollen
        int count = 0; // Zähler für gefundene Primzahlen
        int number = 2; // Startzahl

        while (count < n) {
            if (isPrime(number)) {
                assertTrue( number + " true expected, but was false",PrimeCheck.isPrime(number));
                count++;
            }
            number++;
        }
    }


    // --------------------------------------------------------------- //
    @Test
    public void testNonPrimes() {
        /* ToDo: insert a test here */
        int n = 50; // Anzahl der Primzahlen, die ausgegeben werden sollen
        int count = 0; // Zähler für gefundene Primzahlen
        int number = 2; // Startzahl

        while (count < n) {
            if (!isPrime(number)) {
                assertFalse( number + " false expected, but was true",PrimeCheck.isPrime(number));
                count++;
            }
            number++;
        }
    }
}