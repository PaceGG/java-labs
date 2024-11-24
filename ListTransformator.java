import java.util.ArrayList;
import java.util.List;

public class ListTransformator {
    public static <T, P> List<P> transform(List<T> list, Transformer<T, P> transformer){
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result; 
    }
}
