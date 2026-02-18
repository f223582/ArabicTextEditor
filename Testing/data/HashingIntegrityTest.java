package data;

import dal.HashCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashingIntegrityTest {

    @Test
    public void testSameTextSameHash() throws Exception {

        String hash1 = HashCalculator.calculateHash("Hello World");
        String hash2 = HashCalculator.calculateHash("Hello World");

        assertEquals(hash1, hash2);
    }

    @Test
    public void testDifferentTextDifferentHash() throws Exception {

        String hash1 = HashCalculator.calculateHash("Original Text");
        String hash2 = HashCalculator.calculateHash("Modified Text");

        assertNotEquals(hash1, hash2);
    }

    @Test
    public void testEmptyStringHash() throws Exception {

        String hash = HashCalculator.calculateHash("");

        assertNotNull(hash);
        assertFalse(hash.isEmpty());
    }
}
