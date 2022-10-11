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
    public void filmsLessLimit() {
        PosterManager afisha = new PosterManager();

        afisha.saveFilm("film 1");
        afisha.saveFilm("film 2");
        afisha.saveFilm("film 3");
        afisha.saveFilm("film 4");
        afisha.saveFilm("film 5");
        afisha.saveFilm("film 6");
        afisha.saveFilm("film 7");
        afisha.saveFilm("film 8");
        afisha.saveFilm("film 9");

        String[] expected = {"film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsAsLimit() {
        PosterManager afisha = new PosterManager();

        afisha.saveFilm("film 1");
        afisha.saveFilm("film 2");
        afisha.saveFilm("film 3");
        afisha.saveFilm("film 4");
        afisha.saveFilm("film 5");
        afisha.saveFilm("film 6");
        afisha.saveFilm("film 7");
        afisha.saveFilm("film 8");
        afisha.saveFilm("film 9");
        afisha.saveFilm("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsmMoreLimit() {
        PosterManager afisha = new PosterManager();

        afisha.saveFilm("film 1");
        afisha.saveFilm("film 2");
        afisha.saveFilm("film 3");
        afisha.saveFilm("film 4");
        afisha.saveFilm("film 5");
        afisha.saveFilm("film 6");
        afisha.saveFilm("film 7");
        afisha.saveFilm("film 8");
        afisha.saveFilm("film 9");
        afisha.saveFilm("film 10");
        afisha.saveFilm("film 11");

        String[] expected = {"film 11", "film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
