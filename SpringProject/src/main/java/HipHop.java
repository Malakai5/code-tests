import java.util.ArrayList;

public class HipHop extends Genre{
    public int averageAge;
    public String[] legends;
    ArrayList<String> songTitles = new ArrayList<>();

    public HipHop(){
        averageAge = 17;
        String[] famous = {"Megan the Stallion", "Big Sean", "Run DMC", "Jay z", "Nelly"};
        this.legends = setLegends(famous);
    }

//    public String[] getLegends(){
//        return this.legends;
//    }
}
