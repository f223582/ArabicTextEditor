package business;

import dal.TFIDFCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TFIDFServiceTest {

    @Test
    public void testTFIDFReturnsNonNegativeValue() {

        TFIDFCalculator calculator = new TFIDFCalculator();

        calculator.addDocumentToCorpus("hello world");
        calculator.addDocumentToCorpus("hello java");

        double score = calculator.calculateDocumentTfIdf("hello world");

        assertTrue(score >= 0);
    }

    @Test
    public void testTFIDFEmptyDocumentReturnsZero() {

        TFIDFCalculator calculator = new TFIDFCalculator();

        calculator.addDocumentToCorpus("hello");

        double score = calculator.calculateDocumentTfIdf("");

        assertEquals(0.0, score, 0.0);
    }

    @Test
    public void testTFIDFNoMatchingTerms() {

        TFIDFCalculator calculator = new TFIDFCalculator();

        calculator.addDocumentToCorpus("apple orange");

        double score = calculator.calculateDocumentTfIdf("banana");

        assertEquals(0.0, score, 0.0);
    }
}
