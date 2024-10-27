public class Name {
    private final String surname;
    private final String name;
    private final String fatherName;

    public Name(String surname, String name, String fatherName){
        if ((surname == null || surname.isEmpty()) && (name == null || name.isEmpty()) && (fatherName == null || fatherName.isEmpty())) throw new IllegalArgumentException("Имя, фамилия и отчество не может быть пустым");

        if (surname != null) this.surname = surname;
        else this.surname = "";

        if (name != null) this.name = name;
        else this.name = "";

        if (fatherName != null) this.fatherName = fatherName;
        else this.fatherName = "";
    }

    public String toString(){
        return surname + " " + name + " " + fatherName;
    }
}