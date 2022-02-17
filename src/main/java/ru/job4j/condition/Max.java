package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public static int max(int first, int second, int third) {
        return (first > max(second, third)) ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int four) {
        return max(first, second) > max(third, four) ? max(first, second) : max(third, four);
    }
}