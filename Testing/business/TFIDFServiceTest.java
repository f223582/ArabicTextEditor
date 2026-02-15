package Testing.business;

import business.services.TFIDFService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TFIDFServiceTest {

    @Test
    void testPositiveTFIDF() {
        TFIDFService service = new TFIDFService();
        double score = service.calculateTFIDF("word word test", "word");

        assertEquals(0.66, score, 0.01);
    }

    @Test
    void testEmptyDocument() {
        TFIDFService service = new TFIDFService();
        double score = service.calculateTFIDF("", "word");

        assertEquals(0.0, score);
    }
}
