import java.util.List;

public class Reduction {
    public static <T> T reduce(List<T> list, Reducer<T> reducer){
        if (list.size() == 0) {
            T result = null;
            return reducer.reduce(result, result);
        }
        T result = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            result = reducer.reduce(result, list.get(i));
        }
        return result;
    }
}
