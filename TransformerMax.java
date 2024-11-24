import java.util.ArrayList;

public class TransformerMax implements Transformer<ArrayList<Integer>, Integer> {
    public Integer apply(ArrayList<Integer> list) {
        Integer max = null;
        for (Integer item : list) {
            if (max == null || item > max) {
                max = item;
            }
        }

        if (max == null) {
            throw new IllegalStateException("Набор чисел пуст.");
        }

        return max;
    }
}
