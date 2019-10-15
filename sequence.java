import java.util.ArrayList;
import java.lang.*;
public class sequence {
    public static final int howMany = 100;
    public static void main (String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.0);

        for (int i = 0; i <= howMany; i++) {
            if (numbers.size() <= 1.0) {
                numbers.add(numbers.get(i) + 0);
            } else if (numbers.get(i) >= Math.pow(2.0, 32.0) - 1) {
                numbers.add(Math.pow(2.0, 32.0) - 1);

            } else {
                numbers.add(numbers.get(i) + numbers.get(i - 1));
            }
        }
        System.out.println(numbers);
    }
}
