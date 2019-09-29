/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Iterator;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class NameRepositoryTest {
    private static final List<String> NAMES = Lists.newArrayList("Robert" , "John" ,"Julie" , "Lora");

    private NameRepository fixture;

    @Before
    public void setUp() {
        fixture = new NameRepository();
    }

    @Test
    public void getIterator() {
        for(Iterator iter = fixture.getIterator(); iter.hasNext();){
            assertTrue(NAMES.contains(iter.next()));
        }
    }

}
