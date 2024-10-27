public class Employee {
    private String name;
    private Departament departament;

    public Employee(String name, Departament departament){
        this.name = name;
        this.departament = departament;
        departament.addEmployee(this);
    }

    public String getName(){
        return name;
    }
    public Departament getDepartament(){
        return departament;
    }

    public String toString(){
        if (isDirector()) return name + " начальник отдела " + departament.getName();
        return name + " работает в отделе " + departament.getName() + " начальник которого " + departament.getDirector().getName();
    }

    public boolean isDirector(){
        return departament != null && departament.getDirector() == this;
    }
}
