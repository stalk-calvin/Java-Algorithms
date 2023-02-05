/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String.pojo;

import com.thoughtworks.xstream.XStream;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XML {
    private static final String INPUT_TEST_XML = "src/test/resources/pojo/test.xml";

    private XStream xstream = new XStream();

    @BeforeEach
    public void setUp() {
        xstream.alias("person", Person.class);
    }

    @Test
    public void shouldReadXML() throws Exception {
        Person newPerson = (Person) xstream.fromXML(FileUtils.readFileToString(new File(INPUT_TEST_XML)));
        assertEquals("Joe", newPerson.getFirstname());
        assertEquals("Walnes", newPerson.getLastname());
        assertEquals(123, newPerson.getPhone().getCode());
        assertEquals("1234-456", newPerson.getPhone().getNumber());
        assertEquals(123, newPerson.getFax().getCode());
        assertEquals("9999-999", newPerson.getFax().getNumber());
    }

    @Test
    public void shouldWriteXML() throws Exception {
        Person joe = new Person("Joe", "Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));
        String xml = xstream.toXML(joe);
        assertEquals(FileUtils.readFileToString(new File(INPUT_TEST_XML)), xml);
    }
}
