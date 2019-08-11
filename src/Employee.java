public class Employee {

    private int employeeID;
    private double baseSalary;
    private String name;

                    /* --- constructors --- */
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

                    /* --- methods --- */
    public double getBaseSalary(){
        return baseSalary;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public Employee getManager(){

    }

    public boolean equals(Employee other){
        return this.employeeID == other.employeeID;
    }

    public String toString(){
        return baseSalary + " " + name;
    }

    public String employeeStatus(){

    }
}
