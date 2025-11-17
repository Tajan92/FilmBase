package app;

import data.Film;

import java.util.ArrayList;
import java.util.Collection;

public class FilmBase {
    private Collection<Film> allFilms = new ArrayList<>();

    public FilmBase() {
    }

    public void start(){
        System.out.println("FilmBasen er startet");
        initFilms();
        printList(allFilms);
    }

    private void printList(Collection<Film> films){
        for (Film film : films) {
            System.out.println(film.getTitle()+" "+film.getYear());
        }
    }

    private void initFilms(){
        allFilms.add(new Film("The Godfather", 1972));
        allFilms.add(new Film("The Shawshank Redemption", 1994));
        allFilms.add(new Film("Schindler's List", 1993));
        allFilms.add(new Film("Raging Bull", 1980));
        allFilms.add(new Film("Casablanca", 1942));
        allFilms.add(new Film("Citizen Kane", 1941));
        allFilms.add(new Film("Gone With The Wind", 1939));
        allFilms.add(new Film("The Wizard Of Oz", 1939));
        allFilms.add(new Film("One Flew Over The Cuckoo's Nest", 1975));
        allFilms.add(new Film("Lawrence Of Arabia", 1962));
    }
}
