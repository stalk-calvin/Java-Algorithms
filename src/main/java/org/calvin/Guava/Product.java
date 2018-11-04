/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import javax.annotation.Nonnull;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import lombok.Data;

@Data
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
    public int compareTo(@Nonnull Product that) {
        return ComparisonChain.start()
                .compare(name, that.getName(), Ordering.natural().nullsFirst())
                .compare(description, that.getDescription(), Ordering.natural().nullsFirst())
                .result();
    }
}
