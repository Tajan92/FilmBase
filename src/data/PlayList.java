package data;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Film> playLists = new ArrayList<>();


    public boolean addFilm(Film film) {
        if(hasFilm(film)){
            System.out.println(film.getTitle()+" is already on the playlist");
            return false;
        } else {
            playLists.add(film);
            return true;
        }
    }

    public Film playFilm() {
        if (hasNext()) {
            return playLists.removeFirst();
        }else{
            return null;
        }
    }

    public Film nextFilm() {
        if(hasNext()) {
            return playLists.get(1);
        } else{
            return null;
        }
    }

    public int fullPlayList() {
        return playLists.size();
    }

    public List<Film> getPlayList() {
return playLists;
    }

    public void printPlayList() {
        for (Film playList : playLists) {
            System.out.println(playList.getTitle()+" "+playList.getYear()+" : "+playList.getGenre());
        }
    }
    private boolean hasFilm (Film film){
        if (playLists.contains(film)){
            return true;
        }
        return false;
    }
    public boolean hasNext(){
        try {
            if (playLists.contains(playLists.getFirst())){
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
