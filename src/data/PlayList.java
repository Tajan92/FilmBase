package data;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Film> playLists = new ArrayList<>();


    public void addFilm(Film film) {
        playLists.add(film);
    }

    public Film playFilm() {
        return playLists.removeFirst();
    }

    public Film nextFilm() {
        return playLists.get(1);
    }

    public int fullPlayList() {
        return playLists.size();
    }

    public List<Film> getPlayList() {
return playLists;
    }

    public void printPlayList() {
        for (Film playList : playLists) {
            System.out.println(playList.getTitle()+" "+playList.getYear());
        }
    }
}
