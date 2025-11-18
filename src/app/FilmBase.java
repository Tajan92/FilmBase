package app;

import data.Film;
import data.Genre;
import data.PlayList;

import java.util.*;

public class FilmBase {
    private List<Film> allFilms = new ArrayList<>();
    private PlayList playLists = new PlayList();


    public void testPlayList() {
        playLists.addFilm(allFilms.get(0));
        playLists.addFilm(allFilms.get(1));
        playLists.addFilm(allFilms.get(1));
        playLists.addFilm(allFilms.get(2));
        playLists.printPlayList();
        playLists.removeGenre(Genre.Crime);
        System.out.println("==After Crime Removal==");
        playLists.printPlayList();
        /*while (playListsTest.hasNext()) {
            System.out.println();

            System.out.println(playListsTest.playFilm().getTitle());

            System.out.println();

            playListsTest.printPlayList();

            playListsTest.removeGenre(Genre.Crime);

            System.out.println();

            playListsTest.printPlayList();
        }*/

        /*playListsTest.printPlayList();
        System.out.println();
        System.out.println(playListsTest.nextFilm().getTitle()+" "+playListsTest.nextFilm().getYear());
        playListsTest.playFilm();
        System.out.println();
        playListsTest.printPlayList();
        System.out.println();
        playListsTest.playFilm();
        playListsTest.printPlayList();
        System.out.println();
        playListsTest.playFilm();
        playListsTest.printPlayList();*/
    }

    public FilmBase() {

    }

    public void start() {
        System.out.println("FilmBasen er startet");
        initFilms();
        // printList(allFilms);
        // testPlayList();
        //testFiltering();
        countGenre();
    }

    private void countGenre() {
        Set<Genre> allGenres = new TreeSet<>();
        for (Film film : allFilms) {
            allGenres.addAll(film.getGenres());
        }
        System.out.println(allGenres);

        Map<Genre, Collection <Film>> genreFilms = new TreeMap<>();


        for (Film film : allFilms) {
            for (Genre genre : film.getGenres()) {
                Collection<Film>filmCollection = new ArrayList<>();
                if (!genreFilms.containsKey(genre)) {
                    filmCollection.add(film);
                    genreFilms.put(genre, filmCollection);
                }else{
                    filmCollection = genreFilms.get(genre);
                    filmCollection.add(film);
                }
            }
        }

        for (Genre genre : genreFilms.keySet()) {
            System.out.println("Genre: "+genre);

            for (Film film : genreFilms.get(genre)) {
                System.out.println(" Film: " + film.getTitle() + " (" + film.getYear() + ")");
            }
        }
    }

    private void testFiltering() {
        PlayList playList = new PlayList();
        playList.addFilm(allFilms.get(0));
        playList.addFilm(allFilms.get(1));
        playList.addFilm(allFilms.get(2));
        playList.addFilm(allFilms.get(3));

        playList.printPlayList();
    }

    private void printList(Collection<Film> films) {
        for (Film film : films) {
            System.out.println(film.getTitle() + " " + film.getYear());
        }
    }

    private void initFilms() {
        addFilm(new Film("The Godfather", 1972, Genre.Crime, Genre.Action));
        addFilm(new Film("The Shawshank Redemption", 1994, Genre.Drama, Genre.Action));
        addFilm(new Film("Schindler's List", 1993, Genre.History, Genre.Action));
        addFilm(new Film("Raging Bull", 1980, Genre.Drama, Genre.Sport));
        addFilm(new Film("Casablanca", 1942, Genre.Romance, Genre.Drama));
        addFilm(new Film("Citizen Kane", 1941, Genre.Adventure, Genre.Action));
        addFilm(new Film("Gone With The Wind", 1939, Genre.History, Genre.Biography));
        addFilm(new Film("The Wizard Of Oz", 1939, Genre.Adventure, Genre.Comedy));
        addFilm(new Film("One Flew Over The Cuckoo's Nest", 1975, Genre.Comedy));
        addFilm(new Film("Lawrence Of Arabia", 1962, Genre.History, Genre.Biography));
    }
    private void addFilm(Film film){
        allFilms.add(film);
    }
}
