package com.kodilla.patterns.builder.bigmac;

import java.util.*;

import static com.kodilla.patterns.builder.bigmac.Ingrigients.*;

public class Bigmac {

    private final String bun;
    private final String burgers;
    private final String sauce;
    private List<String> ingridients = new ArrayList<>();

    private Bigmac(String bun, String burgers, String sauce, List<String> ingridients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingridients = ingridients;
    }

    public String getBun() {
        return bun;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngridients() {
        return ingridients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }

    public static class Builder {
        private String bun;
        private String burgers;
        private String sauce;
        private final List<String> ingridients = new ArrayList<>();

        public Builder bun(Bun bun) {
            switch (bun) {
                case STANDARD -> this.bun = "Standard";
                case SESAME -> this.bun = "Sesame";
                default -> this.bun = "Standard";
            }
            return this;
        }

        public Builder burgers(final String burgers) {
            this.burgers = burgers;
            return this;
        }

        public Builder sauce(Sauce sauce) {
            switch (sauce) {
                case ISLANDS -> this.sauce = "Thousand Island";
                case BARBECUE -> this.sauce = "Barbecue";
                case STANDARD -> this.sauce = "Standard";
                default -> this.sauce = "Standard";
            }
            return this;
        }

        public Builder ingridients(Ingrigients ingrigients) {
            switch (ingrigients) {
                case BEACON -> ingridients.add("Beacon");
                case CHAMPIGNONS -> ingridients.add("Champignon");
                case ONION -> ingridients.add("Onion");
                case SALAD -> ingridients.add("Salad");
                case CHILLI -> ingridients.add("Chilli");
                case CUCUMBER -> ingridients.add("Cucumber");
                case SHRIMP -> ingridients.add("Shrimp");
                case CHEESE -> ingridients.add("Cheese");
                default -> ingridients.add("None");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingridients);
        }
    }
}