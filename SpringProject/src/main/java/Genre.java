import java.util.ArrayList;

public class Genre {
    private Genre genre;
    private ArrayList<Song> songList = new ArrayList<>();
    public String[] legends = new String[5];

    public String[] setLegends(String[] legends) {
        return this.legends = legends;
    }
}

