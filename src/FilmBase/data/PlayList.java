package FilmBase.data;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Film> films = new ArrayList<>();

    public boolean addFilm(Film film) {
        if (hasFilm(film)) {
            System.out.println(film.getTitle() + " is already on the playlist");
            return false;
        } else {
            films.add(film);
            return true;
        }
    }

    public Film playFilm() {
        if (hasNext()) {
            return films.removeFirst();
        } else {
            return null;
        }
    }

    public Film nextFilm() {
        if (hasNext()) {
            return films.get(1);
        } else {
            return null;
        }
    }

    public int fullPlayList() {
        return films.size();
    }

    public List<Film> getPlayList() {
        return films;
    }

    public void printPlayList() {
        for (Film playList : films) {
            System.out.println(playList.getTitle() + " " + playList.getYear() + " : " + playList.getGenres());
        }
    }

    private boolean hasFilm(Film film) {
        if (films.contains(film)) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        try {
            if (films.contains(films.getFirst())) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void removeGenre(Genre genre) {
        films.removeIf(film -> film.hasGenre(genre));

    }

}


