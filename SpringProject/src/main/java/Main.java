import org.springframework.beans.factory.BeanFactory;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Matching matching = new Matching();
        Genre genre = new Rock();
        CpuManagement mySystem = new CpuManagement();
        mySystem.setSystemBefore();

        matching.setGenre(genre);
        matching.setLegends(genre.legends);
        System.out.println(Arrays.toString(genre.legends));


        mySystem.setSystemAfter();
        System.out.println(mySystem.cpuBefore + " " + mySystem.cpuAfter + " " + mySystem.nanoTimeAfter);

        System.out.println(mySystem.getCpuUsage());









    }
}
