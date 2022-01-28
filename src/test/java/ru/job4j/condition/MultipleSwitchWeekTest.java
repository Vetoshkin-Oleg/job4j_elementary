package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notExist() {
        String in = "Неизвестный";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}