import java.util.ArrayList;

public class SorterOnlyPositive implements Sorter<ArrayList<Integer>> {
    public boolean test(ArrayList<Integer> list) {
        for (Integer item : list) {
            if (item < 0) return false;
        }
        return true;
    }
}
