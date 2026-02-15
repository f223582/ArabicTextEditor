package Testing.business;

import business.commands.ImportCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImportCommandTest {

    @Test
    void testValidImport() {
        ImportCommand cmd = new ImportCommand("sample.txt");
        assertDoesNotThrow(cmd::execute);
    }

    @Test
    void testInvalidImport() {
        ImportCommand cmd = new ImportCommand("");
        assertThrows(IllegalArgumentException.class, cmd::execute);
    }
}
