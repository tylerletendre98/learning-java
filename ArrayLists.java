import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i= 0; i<=10; i++){
            numbers.add(i);
        }

        numbers.forEach(number ->{
            System.out.println(number * 2);
        });

        // System.out.println(numbers.toString());

        // numbers.sort(Comparator.reverseOrder());
        // System.out.println(numbers.contains(Integer.valueOf(5)));
        // System.out.println(numbers.size());
        // System.out.println(numbers.toString());
    }
}
