package org.calvin.DesignPatterns.Creational.Builder.Hierarchical;

import java.util.EnumSet;
import java.util.Objects;

public class VeggiePizza extends Pizza {
    public enum Veggie { MUSHROOM, ONION, PEPPER, LETTUCE }
    private final EnumSet<Veggie> veggies;

    public static class Builder extends Pizza.Builder<Builder> {
        EnumSet<Veggie> veggies = EnumSet.noneOf(Veggie.class);

        public Builder(Size size) {
            super(size);
        }

        public Builder addVeggies(Veggie v) {
            veggies.add(Objects.requireNonNull(v));
            return self();
        }

        @Override public VeggiePizza build() {
            return new VeggiePizza(this);
        }

        @Override protected Builder self() { return this; }
    }

    private VeggiePizza(Builder builder) {
        super(builder);
        veggies = builder.veggies;
    }

    @Override public String toString() {
        return String.format("VeggiePizza with %s, Size: %s, Veggies: %s",
                toppings, size, veggies);
    }
}
