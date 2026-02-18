package business;

import dal.Transliteration;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransliterateCommandTest {

    @Test
    public void testArabicTransliterationNotEmpty() {

        String result = Transliteration.transliterate("سلام");

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEmptyInputReturnsEmpty() {

        String result = Transliteration.transliterate("");

        assertEquals("", result);
    }

    @Test
    public void testEnglishInputRemainsValid() {

        String result = Transliteration.transliterate("hello");

        assertNotNull(result);
    }
}
