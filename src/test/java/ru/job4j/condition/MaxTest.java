package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2And3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And3And2Then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3And2And1Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2And3And4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int four = 4;
        int result = Max.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And3And4And2Then4() {
        int first = 1;
        int second = 3;
        int third = 4;
        int four = 2;
        int result = Max.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2And4And3And1Then4() {
        int first = 2;
        int second = 4;
        int third = 3;
        int four = 1;
        int result = Max.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4And1And3And2Then4() {
        int first = 4;
        int second = 1;
        int third = 3;
        int four = 2;
        int result = Max.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}