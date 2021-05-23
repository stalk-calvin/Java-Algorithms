package org.calvin.Search.Lucene;

import org.apache.lucene.document.Document;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LuceneTest {
    private Lucene fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Lucene();
        fixture.addDoc("Taste of a good coffee", "11111111");
        fixture.addDoc("Coffee for Dummies", "11112222");
        fixture.addDoc("How to make a good coffee", "22223333");
        fixture.addDoc("Coffee dictionary", "33334444");
        fixture.indexWriter.close();
    }

    @Test
    public void shouldQueryISBN() throws Exception {
        String searchquery = "1111*";
        List<Document> actual = fixture.query("isbn", searchquery, 10);
        for (Document d : actual) {
            assertTrue(d.get("isbn").startsWith("1111"));
        }
    }

    @Test
    public void shouldQueryTitle() throws Exception {
        String searchquery = "coffee";
        List<Document> actual = fixture.query("title", searchquery, 10);
        for (Document d : actual) {
            assertTrue(d.get("title").toLowerCase().contains("coffee"));
        }
    }
}