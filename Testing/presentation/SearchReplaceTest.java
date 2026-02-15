package Testing.presentation;

import presentation.TextEditor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchReplaceTest {

    @Test
    void testReplaceWordSuccess() {
        TextEditor editor = new TextEditor();
        String result = editor.searchAndReplace("hello world", "world", "java");

        assertEquals("hello java", result);
    }

    @Test
    void testReplaceWordNotFound() {
        TextEditor editor = new TextEditor();
        String result = editor.searchAndReplace("hello world", "python", "java");

        assertEquals("hello world", result);
    }

    @Test
    void testReplaceEmptyContent() {
        TextEditor editor = new TextEditor();
        String result = editor.searchAndReplace("", "word", "new");

        assertEquals("", result);
    }
}
