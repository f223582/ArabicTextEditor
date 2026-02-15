package Testing.business;

import business.commands.ExportCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExportCommandTest {

    @Test
    void testValidExport() {
        ExportCommand cmd = new ExportCommand("file.txt", "content");
        assertDoesNotThrow(cmd::execute);
    }

    @Test
    void testNullContentExport() {
        ExportCommand cmd = new ExportCommand("file.txt", null);
        assertThrows(IllegalArgumentException.class, cmd::execute);
    }
}
