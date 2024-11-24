public class TransformerLength implements Transformer<String, Integer>{
    public Integer apply(String s){
        return s.length();
    }
}
