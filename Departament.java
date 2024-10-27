import java.util.ArrayList;

public class Departament {
    private String name;
    private Employee director;
    private ArrayList<Employee> staff;

    public Departament(String name){
        this.name = name;
        this.director = null;
        this.staff = new ArrayList<>();
    }

    public void setDirector(Employee employee){
        this.director = employee;
    }
    public void addEmployee(Employee employee){
        staff.add(employee);
    }

    public String getName(){
        return name;
    }
    public Employee getDirector(){
        return director;
    }
    public ArrayList getStaff(){
        return staff;
    }
}
