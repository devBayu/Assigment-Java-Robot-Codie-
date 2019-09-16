import com.enigma.model.Codie;
import com.enigma.model.Directions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Coordinate X,Y,(NORTH,SOUTH,EAST,WEST)");
        String inputCoordinate = reader.readLine();
        String[] post = inputCoordinate.split(",");
        Codie codie = new Codie(Integer.parseInt(post[0]), Integer.parseInt(post[1]), Directions.valueOf(post[2]));

        System.out.println("===Beri Point Untuk Codie===");
        String point = reader.readLine();
        Integer inputPoint = Integer.parseInt(point);
        codie.setPoint(inputPoint);

        System.out.println("Beri Codie Perintah");
        String statement = reader.readLine();
        codie.setCommands(statement);
        codie.isRun();
        System.out.println(codie.print());
    }
}
