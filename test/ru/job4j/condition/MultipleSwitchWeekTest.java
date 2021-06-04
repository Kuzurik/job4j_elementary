package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {
    @Test
    public void whenDayIsMondayThan1() {
       int result = MultipleSwitchWeek.numberOfDay("Monday");
       int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsThursdayThan1() {
        int result = MultipleSwitchWeek.numberOfDay("Четверг");
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsMayThan0() {
        int result = MultipleSwitchWeek.numberOfDay("May");
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}