public class ReduceInteger implements Reducer<Integer> {
    public Integer reduce(Integer a, Integer b) { return a != null ? a + b: 0; }
}