package learn.oopspackage.inheritance;

public class Employee extends Person {
    private String title;
    private String employer;
    private String employeeGrade;
    private double salary;

    public Employee(String name,String title){
        super(name);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{Name :"+ super.getName() +
                ", Address :"+ super.getAddress() +", Mobile Number : "+super.getMobileNumber()+
                ", title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade='" + employeeGrade + '\'' +
                ", salary=" + salary +
                '}';
    }
}

