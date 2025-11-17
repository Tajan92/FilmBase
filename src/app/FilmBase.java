package app;

import data.Film;
import data.Genre;
import data.PlayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FilmBase {
    private List<Film> allFilms = new ArrayList<>();
    private PlayList playListsTest = new PlayList();

    public void testPlayList() {
        playListsTest.addFilm(allFilms.get(0));
        playListsTest.addFilm(allFilms.get(1));
        playListsTest.addFilm(allFilms.get(1));
        playListsTest.addFilm(allFilms.get(2));
        playListsTest.printPlayList();
        playListsTest.removeGenre(Genre.Crime);
        System.out.println("==After Crime Removal==");
        playListsTest.printPlayList();
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
        testPlayList();
        //testFiltering();
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
        allFilms.add(new Film("The Godfather", 1972, Genre.Crime, Genre.Action));
        allFilms.add(new Film("The Shawshank Redemption", 1994, Genre.Drama, Genre.Action));
        allFilms.add(new Film("Schindler's List", 1993, Genre.History, Genre.Action));
        allFilms.add(new Film("Raging Bull", 1980, Genre.Drama, Genre.Sport));
        allFilms.add(new Film("Casablanca", 1942, Genre.Romance, Genre.Drama));
        allFilms.add(new Film("Citizen Kane", 1941, Genre.Adventure, Genre.Action));
        allFilms.add(new Film("Gone With The Wind", 1939, Genre.History, Genre.Biography));
        allFilms.add(new Film("The Wizard Of Oz", 1939, Genre.Adventure, Genre.Comedy));
        allFilms.add(new Film("One Flew Over The Cuckoo's Nest", 1975, Genre.Comedy));
        allFilms.add(new Film("Lawrence Of Arabia", 1962, Genre.History, Genre.Biography));
    }
}
