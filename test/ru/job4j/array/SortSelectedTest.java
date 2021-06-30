package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortTreeElements() {
        int[] data = new int[] {5, 2, 7,};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFiveElements() {
        int[] data = new int[] {8, 2, 9, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}