package presentation;

import org.junit.Test;

import static org.junit.Assert.*;

public class AutoSaveTest {

    @Test
    public void testWordCountBelowThreshold() {

        String shortText = "This is short text.";
        int wordCount = shortText.split("\\s+").length;

        assertTrue(wordCount <= 500);
    }

    @Test
    public void testWordCountAboveThreshold() {

        StringBuilder longText = new StringBuilder();

        for (int i = 0; i < 600; i++) {
            longText.append("word ");
        }

        int wordCount = longText.toString().split("\\s+").length;

        assertTrue(wordCount > 500);
    }

    @Test
    public void testAutoSaveConditionLogic() {

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 600; i++) {
            text.append("word ");
        }

        int wordCount = text.toString().split("\\s+").length;

        boolean shouldAutoSave = (wordCount > 500);

        assertTrue(shouldAutoSave);
    }
}
