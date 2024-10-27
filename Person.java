public class Person {
    private String name;
    private int height;

    public Person(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String toString(){
        return "Человек с именем \"" + name + "\" и ростом " + height;
    }
}
