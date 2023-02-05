package org.calvin.ObjectOriented.Generics;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GenericStaticFactoryTest {

    @Test
    public void newHashMap() {
        Map<String, List<String>> aMap = GenericStaticFactory.newHashMap();
        aMap.put("a", Lists.newArrayList("a","b"));
        assertEquals(Lists.newArrayList("a","b"), aMap.get("a"));

    }
}