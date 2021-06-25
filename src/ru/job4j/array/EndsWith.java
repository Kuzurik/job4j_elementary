package ru.job4j.array;

import java.util.Arrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        char[] temp = new char[post.length];
        for (int i = 0; i < post.length; i++) {
            temp[i] = word[word.length - post.length + i];
        }
        return Arrays.equals(temp, post);
    }
}
