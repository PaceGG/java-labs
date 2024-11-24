import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static <T> List<T> filter(List<T> list, Sorter<T> sorter){
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (sorter.test(item)) result.add(item);
        }
        return result;
    }
}
