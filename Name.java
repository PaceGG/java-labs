public class Name {
    private String surname;
    private String name;
    private String fatherName;

    public Name(String surname, String name, String fatherName){
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
    }

    public Name(String surname, String name){
        this.surname = surname;
        this.name = name;
        this.fatherName = "";
    }

    public Name(String surname){
        this.surname = surname;
        this.name = "";
        this.fatherName = "";
    }

    public String toString(){
        return surname + " " + name + " " + fatherName;
    }
}
