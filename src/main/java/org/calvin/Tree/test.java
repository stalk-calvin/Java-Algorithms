/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    private String name;
    public test(String name)
    {
        this.name=name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) { //ref check to see if they are indeed the same
            return true;
        }
        if (o == null || getClass() != o.getClass()) { // basic checks
            return false;
        }
        test test = (test) o;
        return name != null ? name.equals(test.name) : test.name == null; // see if they have the same name
    }
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    public static void main(String[] args) {
        Map<Object, Object> cache = new HashMap<>();
        List<String> list = Arrays.asList("pollinating sandboxes",
                "amusement & hemophilias",
                "schoolxworks = perversive",
                "electrolysissweeteners.net",
                "constitutionalunstableness.net",
                "grinnerslaphappier.org",
                "amusement & hemophilias",
                "WWW.BUMRACEGOERS.ORG",
                "WWW.RACCOONPRUDENTIALS.NET",
                "xx: the unredeemed lollipop...",
                "Incentively, my dear, I don't tessellate a derangement.",
                "A person who never yodelled an apology, never preened vocalizing transsexuals.");
        for (String s : list) {
            cache.put(new test(s), s);
        }
    }
}
