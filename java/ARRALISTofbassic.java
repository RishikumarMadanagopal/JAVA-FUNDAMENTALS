import java.util.ArrayList;

public class ARRALISTofbassic {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
myNumbers.add(10);
myNumbers.add(20);
myNumbers.add(30);

for (int ii : myNumbers) {
  System.out.println(ii);

}
  for(int i=0; i < cars.size();i++)
  {
    System.out.println(cars.get(i));



  }

  for(String car : cars){
    System.out.println(car);  
  }
  
}
}
