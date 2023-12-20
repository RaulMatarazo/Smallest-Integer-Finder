import java.util.ArrayList;
import java.util.Arrays;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(34, -345, -1, 100, -1000000));
        int SmallestNumber = array.get(0);
        for (int index = 0; index < array.size(); index++) {
            if (array.get(index) < SmallestNumber) {
                SmallestNumber = array.get(index);
            } 
        }
        System.out.println(SmallestNumber);
    }
}