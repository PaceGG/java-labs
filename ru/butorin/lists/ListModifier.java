package ru.butorin.lists;
import java.util.ArrayList;
import java.util.List;

public class ListModifier<T> {
    public static <T> void modifyList(List<T> list, T element){
        int index = list.indexOf(element);
        if (index != -1) {
            List<T> sublist = new ArrayList<>(list);
            list.addAll(index + 1, sublist);
        }
    }
}
