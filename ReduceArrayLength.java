import java.util.ArrayList;

public class ReduceArrayLength implements Reducer<ArrayList<Integer>> {
    public ArrayList<Integer> reduce(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }
}
