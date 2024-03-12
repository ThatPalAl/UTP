package LambdaExpressions.e2;

public class Employee {
    private final String lname;
    private final String fname;
    private final Integer age;
    private double salary;

    public Employee(String lname, String fname, Integer age, double salary) {
        this.lname = lname;
        this.fname = fname;
        this.age = age;
        this.salary = salary;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public Integer getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return lname + " " + fname;
    }
}