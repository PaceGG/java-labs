import java.util.List;

public class BoxUtils {
    public static void printBoxValue(Box<Integer> box) {
        if (!box.isEmpty()) {
            Integer value = box.getItem();
            System.out.println("Значение в коробке: " + value);
        } else {
            System.out.println("Коробка не содержит объект.");
        }
    }

    public static double findMaxDouble(List<Box<? extends Number>> boxes) {
        Double max = null;
        for (Box<? extends Number> box : boxes) {
            if (!box.isEmpty()){
                double value = box.getItem().doubleValue();
                if (max == null || value > max){
                    max = value;
                }
            }
        }
        if (max == null) throw new IllegalStateException("Набор коробок пуст.");
        return max;
    }
}
