package Testing.presentation;

import presentation.TextEditor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoSaveTest {

    @Test
    void testAutoSaveTriggered() {
        TextEditor editor = new TextEditor();
        String content = "word ".repeat(501);

        assertTrue(editor.shouldAutoSave(content));
    }

    @Test
    void testAutoSaveNotTriggered() {
        TextEditor editor = new TextEditor();
        String content = "word ".repeat(500);

        assertFalse(editor.shouldAutoSave(content));
    }

    @Test
    void testAutoSaveEmpty() {
        TextEditor editor = new TextEditor();

        assertFalse(editor.shouldAutoSave(""));
    }
}
