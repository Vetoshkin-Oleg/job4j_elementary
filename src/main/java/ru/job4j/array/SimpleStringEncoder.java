package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
                if (i == input.length() - 1) {
                    result.append(symbol).append(counter);
                }
            } else {
                result.append(symbol).append(counter > 1 ? counter : "");
                symbol = input.charAt(i);
                counter = 1;
                if (i == input.length() - 1) {
                    result.append(symbol);
                }
            }
        }
        return result.toString();
    }
}