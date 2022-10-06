package ru.netology.poster;

public class PosterManager {
    private String[] titles = new String[0];
    private int limit;

    public PosterManager() {

        this.limit = 10;
    }
    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void saveFilm(String title) {
        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmp[i] = titles[i];
        }
        tmp[tmp.length - 1] = title;
        titles = tmp;
    }

    public String[] findAll() {

        return titles;
    }

    public String[] findLast() {
        int resultlenght;
        if (titles.length < limit) {
            resultlenght = titles.length;
        } else {
            resultlenght = limit;
        }
        String[] tmp = new String[resultlenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = titles[titles.length - 1 - i];
        }
        return tmp;
    }
}
