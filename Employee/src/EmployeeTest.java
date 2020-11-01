//1306180137


public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Batuhan", "Gökçe", 5000);
        Employee employee2 = new Employee("Fatih", "Demir", 7500);
        
        System.out.println("Annual salary of the first employee: " + (employee1.getSalary()*12));
        System.out.println("Annual salary of the second employee: " + (employee2.getSalary()*12));
        
        employee1.setSalary(5000);
        System.out.println("Increased annual salary of the first employee: " + (employee1.getSalary()*12));
        
        employee2.setSalary(7500);
        System.out.println("Increased annual salary of the second employee: " + (employee2.getSalary()*12));
    }
}
