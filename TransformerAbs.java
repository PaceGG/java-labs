public class TransformerAbs implements Transformer<Integer, Integer> {
    public Integer apply(Integer t) {
        return t > 0 ? t : -t;
    }
    
}
