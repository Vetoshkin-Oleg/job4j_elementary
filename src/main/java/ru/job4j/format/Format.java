package ru.job4j.format;

import java.util.Calendar;

public class Format {

    public static void getGreeting(String name) {
        System.out.printf("Привет! Я %s%n", name);
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.printf("Привет, %s! Текущая дата: %tF, Текущее время: %tT%n",
                name, instance, instance);
    }

    public static void main(String[] args) {
        getGreeting("Елена");
        getGreetingAndTime("Игорь");
    }

}