/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Iterator;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class NameRepositoryTest {
    private static final List<String> NAMES = Lists.newArrayList("Robert" , "John" ,"Julie" , "Lora");

    NameRepository fixture;

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
