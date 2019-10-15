import java.util.ArrayList;
import java.util.Arrays;
// public static final int numberOfLines = 10;
public class binomial {
    public static final int lines = 50;
    public static void main(String[] args) {
        int[] start = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(generate());

    }
    public static ArrayList<Integer> addList(ArrayList<Integer> list) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        ArrayList<Integer> returnNew = new ArrayList<Integer>();
        list.add(0, 0);
        list.add(0);

        for(int i = 0; i < list.size(); i++) {
            int copy = i;
            if (i == list.size() - 1) {
                break;
            } else {
                returnList.add(list.get(copy) + list.get(copy + 1));
            }
        }
        for(int i = 0; i < returnList.size(); i++) {
            if (i != 0 || i != returnList.size() - 1) {
                returnNew.add(returnList.get(i));
            }
        }System.out.println(list);
        list.add(1);
        System.out.println(addList(list));
        return returnNew;
    }
    public static ArrayList<ArrayList<Integer>> generate() {
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<>();
        ArrayList<Integer> start = new ArrayList<>();
        start.add(1);
        returnList.add(start);
        for (int i = 1; i <= lines; i++) {
            returnList.add(addList(returnList.get((i -1))));
        }
        return returnList;
    }
}
