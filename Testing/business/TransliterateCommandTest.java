package Testing.business;

import business.commands.TransliterateCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransliterateCommandTest {

    @Test
    void testTransliterationArabic() {
        TransliterateCommand cmd = new TransliterateCommand("سلام");
        String result = cmd.execute();

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void testEmptyInput() {
        TransliterateCommand cmd = new TransliterateCommand("");
        String result = cmd.execute();

        assertEquals("", result);
    }
}
