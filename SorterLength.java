public class SorterLength implements Sorter<String> {
    public boolean test(String s){
        return s.length() >= 3;
    }
}
