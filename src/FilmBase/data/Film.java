package FilmBase.data;

import java.util.*;

public class Film {
    private String title;
    private int year;
    public Genre genre;
    private Set<Genre> genres = new HashSet<>();

    public Film(String title, int year) {
        this.title = title;
        this.year = year;

    }
    public Film(String title, int year, Genre... genres) {
        this.title = title;
        this.year = year;
        this.genres.addAll(List.of(genres));
    }

    public Film(String title, int year, Collection<Genre> genres) {
        this.title = title;
        this.year = year;
        this.genres.addAll(genres);
    }

    public Collection<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
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
    public void addGenre(Genre genre){
        this.genres.add(genre);
    }
    }


