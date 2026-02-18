package business;

import dal.TFIDFCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExportCommandTest {

    @Test
    public void testTFIDFPositiveScore() {

        TFIDFCalculator calculator = new TFIDFCalculator();

        calculator.addDocumentToCorpus("hello world");
        calculator.addDocumentToCorpus("hello java");

        double score = calculator.calculateDocumentTfIdf("hello world");

        assertTrue(score >= 0);
    }

    @Test
    public void testEmptyDocumentTFIDF() {

        TFIDFCalculator calculator = new TFIDFCalculator();

        calculator.addDocumentToCorpus("hello");

        double score = calculator.calculateDocumentTfIdf("");

        assertEquals(0.0, score, 0.0);
    }
}
