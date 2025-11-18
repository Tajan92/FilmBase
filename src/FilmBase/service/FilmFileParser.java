package FilmBase.service;

import FilmBase.data.Film;
import FilmBase.data.Genre;

import java.util.ArrayList;
import java.util.Collection;


public class FilmFileParser {
    public static Film createFilmFromLine(String line) {
        Collection<Genre> genres = new ArrayList<>();
        String[] splitLine = line.split(";");
        String title = splitLine[0].trim();
        int year = Integer.parseInt(splitLine[1].trim());
        String[] splitGenre = splitLine[2].split(",");
        for (String genre : splitGenre) {
            genres.add(Genre.valueOf(genre.trim().replace("-","")));
        }
        return new Film(title,year,genres);
    }
}
