import java.util.ArrayList;
import java.util.Collections;

public class listsorting {
    public static void main(String[] args) {
        var cars = new ArrayList<Integer>();

        cars.add(3);
        cars.add(1);
        cars.add(2);

        Collections.sort(cars,Collections.reverseOrder());
    
        //System.out.println(cars);

        for(Integer car : cars){
            System.out.println(car);
        }
    }
}