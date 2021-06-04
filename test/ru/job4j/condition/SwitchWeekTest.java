package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDayEquals1() {
       String result = SwitchWeek.nameOfDay(1);
       String expected = "monday";
       Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayEquals5() {
        String result = SwitchWeek.nameOfDay(5);
        String expected = "friday";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayEquals0() {
        String result = SwitchWeek.nameOfDay(0);
        String expected = "The number does not match the day of the week";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayEquals8() {
        String result = SwitchWeek.nameOfDay(8);
        String expected = "The number does not match the day of the week";
        Assert.assertEquals(expected, result);
    }
}