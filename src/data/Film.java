package data;

public class Film {
    String title;
    int year;
    Genre genre;

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Film(String title, int year, Genre genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
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
}
