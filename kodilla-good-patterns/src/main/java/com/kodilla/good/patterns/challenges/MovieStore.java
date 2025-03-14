package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStore {
    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }
    public String AllTitlesPrinter() {
        StringBuilder titlesBuildier = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : getMovies().entrySet()) {
            titlesBuildier.append(entry.getValue()).append("!");
        }
        return titlesBuildier.toString();
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.AllTitlesPrinter());
    }
}