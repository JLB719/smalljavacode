import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int[] a = {6, 3, 7, 5, 2, 4};
        int j;
        int t;
        for (int i = 1; i != a.length; i++) {
            j = i;
            t = a[j];
            while(j > 0 && t < a[j-1]) {
                a[j] = a[--j];
            }
            a[j] = t;
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}
