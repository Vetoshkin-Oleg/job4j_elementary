package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void dayMon() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notExist() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}