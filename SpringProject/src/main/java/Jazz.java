import java.util.ArrayList;

public class Jazz extends Genre{
    public int averageAge;
    public String[] legends;
    ArrayList<String> songTitles = new ArrayList<>();

    public Jazz(){
        this.averageAge = 45;
        String[] famous = {"Frank Sinatra", "Louis Armstrong", "Moon Jazmine", "Masego", "Ella Fitzgerald" };
        this.legends = setLegends(famous);
    }

//    public String[] getLegends(){
//        return this.legends;
//    }
}
