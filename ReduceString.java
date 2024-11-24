public class ReduceString implements Reducer<String> {
    public String reduce(String a, String b) { return a != null ? a + b: ""; }
}