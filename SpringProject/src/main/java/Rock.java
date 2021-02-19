import java.util.ArrayList;

public class Rock extends Genre{
    protected int averageAge;
    protected String[] legends;
    ArrayList<String> songTitles = new ArrayList<>();

    public String[] setLegends(String[] legends) {
        return legends;
    }

    public Rock(){
        this.averageAge = 30;
        String[] famous = {"Jimi Hendrix", "Kurt Cobain", "Ozzie Osbourne", "Led Zeppelin", "The Beatles"};
        this.legends = setLegends(famous);
    }

//    public String[] getLegends(){
//        return this.legends;
//    }

}
