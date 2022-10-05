package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void addFilm() {
        PosterManager afisha = new PosterManager();
        afisha.saveFilm("film 1");
        afisha.saveFilm("film 2");
        afisha.saveFilm("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withdrawalLimit() {
        PosterManager afisha = new PosterManager();

        afisha.saveFilm("film 1");
        afisha.saveFilm("film 2");
        afisha.saveFilm("film 3");
        afisha.saveFilm("film 6");
        afisha.saveFilm("film 8");
        afisha.saveFilm("film 10");

        String[] expected = {"film 10", "film 8", "film 6", "film 3", "film 2", "film 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
