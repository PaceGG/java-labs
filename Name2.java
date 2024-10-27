public class Name2 {
    private String surname;
    private String name;
    private String fatherName;

    public Name2(String surname, String name, String fatherName){
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
    }

    public Name2(String surname, String name){
        this.surname = surname;
        this.name = name;
        this.fatherName = "";
    }

    public Name2(String name){
        this.surname = "";
        this.name = name;
        this.fatherName = "";
    }

    public String toString(){
        return name + " " + fatherName + " " + surname;
    }
}
