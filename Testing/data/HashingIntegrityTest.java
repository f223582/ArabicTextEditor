package Testing.data;

import data.persistence.HashUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashingIntegrityTest {

    @Test
    void testHashChangesAfterEdit() {
        String hash1 = HashUtil.generateMD5("Original");
        String hash2 = HashUtil.generateMD5("Edited");

        assertNotEquals(hash1, hash2);
    }

    @Test
    void testSameContentSameHash() {
        String hash1 = HashUtil.generateSHA1("Same");
        String hash2 = HashUtil.generateSHA1("Same");

        assertEquals(hash1, hash2);
    }
}
