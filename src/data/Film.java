package data;

import java.util.ArrayList;
import java.util.Collection;

public class Film {
    private String title;
    private int year;
    public Genre genre;
    private Collection<Genre> genres = new ArrayList<>();

    public Film(String title, int year) {
        this.title = title;
        this.year = year;

    }

    public Film(String title, int year, Genre genre) {
        this.title = title;
        this.year = year;
        this.genres.add(genre);
    }

    public Collection<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Collection<Genre> genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int age) {
        this.year = age;
    }

    public boolean hasGenre(Genre genre) {
        if (genres.contains(genre)) {
            return true;
        }
        return false;
    }
}

