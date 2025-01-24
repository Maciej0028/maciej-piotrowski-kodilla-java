package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem , PoemDecorator poemDecorator) {
        String decorator = poemDecorator.decorator(poem);
        System.out.println(decorator);
    }
}
