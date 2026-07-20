import java.util.ArrayList;
import java.util.Collections;
public class collectoins {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(1);
        
       
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
    }
}
