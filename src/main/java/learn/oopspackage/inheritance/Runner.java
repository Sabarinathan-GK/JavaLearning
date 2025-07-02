package learn.oopspackage.inheritance;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("Sabarinathan G","DEV");
        employee.setAddress("NO8 abc street sholingnallur chennai");
        employee.setMobileNumber("9750948416");
        employee.setEmployer("Fiserv");
        employee.setEmployeeGrade("B1");
        employee.setSalary(10000);
        System.out.println(employee);
    }
}
