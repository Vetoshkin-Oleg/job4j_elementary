package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to613then13() {
        double expected = 13;
        Point a = new Point(1, 1);
        Point b = new Point(6, 13);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1743to53120then85() {
        double expected = 85;
        Point a = new Point(17, 43);
        Point b = new Point(53, 120);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}