package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Macaopo", "leao", "catuaba");
        Map<String, String> map = Map.of("Maicon", "Jackons");
        System.out.println("Hello world!");
    }
}