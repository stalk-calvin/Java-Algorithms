package org.calvin.String;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RegexTest {
    private Regex fixture;

    @Before public void setUp() {
        fixture = new Regex();
    }

    @Test public void parseFirstGroupAddressDotAll() throws Exception {
        List<String> actual = fixture.parseFirstGroupAddressDotAll(
                "Testing... \n" + "Address 1: /88 app 2/8\n" + "superman taman, puchong\n" + "36100, Malaysia\n"
                        + "Address 2: abc" + "testing end");
        assertEquals(Lists.newArrayList("/88 app 2/8\n" + "superman taman, puchong\n" + "36100, Malaysia\n"), actual);
    }

    @Test public void parseFirstGroupAddressMultiline() throws Exception {
        List<String> actual = fixture.parseFirstGroupAddressMultiline(
                "The First line\nThe SecondLine\nThe " + "ThirdLine\nFourth Line Ignored");
        assertEquals(Lists.newArrayList("The First line", "The SecondLine", "The ThirdLine"), actual);
    }

}
