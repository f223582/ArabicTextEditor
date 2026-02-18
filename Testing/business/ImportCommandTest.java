package business;

import bll.SearchWord;
import dto.Documents;
import dto.Pages;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ImportCommandTest {
    
    @Test
    public void testKeywordFoundInDocument() {
        Pages page = new Pages(1, 1, 1, "upload");

        Documents doc = new Documents(
                1,
                "TestDoc",
                "dummyHash",
                "dummyLastModified",
                "dummyDateCreated",
                Arrays.asList(page)
        );

        List<Documents> docs = Arrays.asList(doc);

        List<String> result = SearchWord.searchKeyword("upload", docs);

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testKeywordNotFound() {
        Pages page = new Pages(1, 1, 1, "hello java");

        Documents doc = new Documents(
                1,
                "TestDoc",
                "dummyHash",
                "dummyLastModified",
                "dummyDateCreated",
                Arrays.asList(page)
        );

        List<Documents> docs = Arrays.asList(doc);

        List<String> result = SearchWord.searchKeyword("python", docs);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
