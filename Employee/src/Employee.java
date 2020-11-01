//1306180137


public class Employee {

    String name;
    String surName;
    double salary;

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be below 0");
        } else {
            this.salary = salary+salary/10;
        }

    }
}
