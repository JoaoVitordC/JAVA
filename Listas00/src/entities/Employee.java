package entities;

public class Employee{
    private Integer Id;
    private String Name;
    private Double Salary;

    public Employee(Integer id, String name, Double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public void increaseSalary(double percentege)
    {
        Salary *= Salary * percentege / 100.0;


    }


public  String toString(){
  return Id + ", " + Name + ", " + String.format("%.2f", Salary);
}
}