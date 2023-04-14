import Listenify.Album;
import Listenify.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Album> albums=new ArrayList<>();
    public static void main(String[] args) {
      Album album=new Album("Old Hindi Song","Arijit Singh");

      album.addSongToAlbum("Pathaan",4.5);
        album.addSongToAlbum("Channa mereya",3.5);
        album.addSongToAlbum("Naina",5.0);

        albums.add(album);

        album=new Album("New Songs","Prateek kuhad");

        album.addSongToAlbum("Rap god",4.5);
        album.addSongToAlbum("Not Afraid",3.5);
        album.addSongToAlbum("Lose Yourself",4.5);

        albums.add(album);

        LinkedList<Song> playList_1=new LinkedList<>();

        albums.get(0).addSongToPlayList("Pathaan",playList_1);
        albums.get(0).addSongToPlayList("Naina",playList_1);
        albums.get(1).addSongToPlayList("Rao god",playList_1);
        albums.get(1).addSongToPlayList("Not Afraid",playList_1);


    }
}