import java.util.ArrayList;

public class Matching {
    private Genre genre;
    private ArrayList<Song> songList = new ArrayList<>();

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public String[] setLegends(String[] legends){
        return legends;
    }

    public void addSongToList(ArrayList<Song> songList, Song song){
        this.songList.add(song);
    }
}
