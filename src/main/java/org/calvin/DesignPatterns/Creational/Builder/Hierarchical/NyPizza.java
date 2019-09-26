package org.calvin.DesignPatterns.Creational.Builder.Hierarchical;

// Subclass with hierarchical builder (Page 15)
public class NyPizza extends Pizza {
    public static class Builder extends Pizza.Builder<Builder> {

        public Builder(Size size) {
            super(size);
        }

        @Override public NyPizza build() {
            return new NyPizza(this);
        }

        @Override protected Builder self() { return this; }
    }

    private NyPizza(Builder builder) {
        super(builder);
    }

    @Override public String toString() {
        return "New York Pizza with " + toppings + ", Size: " + size;
    }
}

