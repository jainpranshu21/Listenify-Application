package Listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    public String albumName;
    public String artistName;
    public List<Song> songList;

    public Album(String s, String arijit_singh) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList= new ArrayList<>();
    }

    boolean findSongInAlbum(String title){
        for(Song song:songList) {
            if (song.title.equals(title))
                return true;
        }
        return false;
    }

    public String addSongToAlbum(String title,double duration){
        if(findSongInAlbum(title)==true)
            return "Song is already present";
        else{
            Song newSong=new Song(title,duration);
            songList.add(newSong);
            return "New song has been added successfully";
        }
    }

    public String addSongToPlayList(int trackNo, LinkedList<Song> playList){
        int index=trackNo-1;
        if(index>=0 && index<this.songList.size()){
            Song song=this.songList.get(index);
            playList.add(song);
            return "Song added successfully to playlist";
        }
        return "Invalid trackNo";
    }


    public String addSongToPlayList(String title,LinkedList<Song> playList) {
        for(Song song:songList){
            if(song.title.equals(title)){
               playList.add(song);
               return "Song has been added successfully tp playlist";
            }
        }
        return "Song does not exist in songlist";

    }
}
