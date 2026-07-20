import java.util.ArrayList;
import java.util.Collections;

public class collectionsss {
  public static void main(String[] args) {
    var cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Audi");

    Collections.sort(cars);




    // Sort cars
    for (String i : cars) {
    System.out.println(i);
    }


    var numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(3);
    numbers.add(8);     
    numbers.add(1);

    Collections.sort(numbers);
    for(int so : numbers){
    System.out.println(so);
    }
  }
  }
