package presentation;

import bll.SearchWord;
import dto.Documents;
import dto.Pages;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchReplaceTest {

    @Test(expected = IllegalArgumentException.class)
    public void testKeywordLessThanThreeThrowsException() {

        List<Documents> docs = Arrays.asList();
        SearchWord.searchKeyword("hi", docs);
    }

    @Test
    public void testKeywordFoundWithPrefix() {

        Pages page = new Pages(1, 1, 1, "hello world java");

        Documents doc = new Documents(
                1,
                "TestDoc",
                "hash",
                "modified",
                "created",
                Arrays.asList(page)
        );

        List<Documents> docs = Arrays.asList(doc);

        List<String> result = SearchWord.searchKeyword("world", docs);

        assertFalse(result.isEmpty());
        assertTrue(result.get(0).contains("hello world"));
    }

    @Test
    public void testKeywordFoundAtBeginning() {

        Pages page = new Pages(1, 1, 1, "world java test");

        Documents doc = new Documents(
                1,
                "TestDoc",
                "hash",
                "modified",
                "created",
                Arrays.asList(page)
        );

        List<Documents> docs = Arrays.asList(doc);

        List<String> result = SearchWord.searchKeyword("world", docs);

        assertFalse(result.isEmpty());
        assertTrue(result.get(0).contains("world"));
    }

    @Test
    public void testKeywordNotFound() {

        Pages page = new Pages(1, 1, 1, "hello java");

        Documents doc = new Documents(
                1,
                "TestDoc",
                "hash",
                "modified",
                "created",
                Arrays.asList(page)
        );

        List<Documents> docs = Arrays.asList(doc);

        List<String> result = SearchWord.searchKeyword("python", docs);

        assertTrue(result.isEmpty());
    }
}
