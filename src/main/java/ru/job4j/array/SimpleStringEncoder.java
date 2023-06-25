package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                if (counter > 1) {
                    result.append(input.charAt(i - 1)).append(counter);
                    counter = 1;
                } else {
                    result.append(input.charAt(i - 1));
                    counter = 1;
                }
            }
        }
        if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
            result.append(input.charAt(input.length() - 1)).append(counter);
        }
        if (input.charAt(input.length() - 1) != input.charAt(input.length() - 2)) {
            result.append(input.charAt(input.length() - 1));
        }
        return result.toString();
    }
}