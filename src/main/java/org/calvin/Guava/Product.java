/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import lombok.ToString;

@ToString
public class Product implements Comparable<Product> {
    private String name;
    private String description;

    public Product(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Product that) {
        return ComparisonChain.start()
                .compare(description, that.getDescription(), Ordering.natural().nullsFirst())
                .compare(name, that.getName(), Ordering.natural().nullsFirst())
                .result();
    }
}