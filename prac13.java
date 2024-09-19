    class Employee  {
     String firstName;
     String lastName;
     double Salary;
    public Employee(String firstName, String lastName, double Salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(Salary); } 
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return Salary;
    }
   public void setSalary(double Salary) {
        if (Salary > 0.0) {
            this.Salary = Salary;
        } else {
            this.Salary = 0.0;
        }
    }
    public void giveRaise() {
        this.Salary += this.Salary * 0.10;
    }
    public double getYearlySalary() {
        return this.Salary * 12;
    }
 public void displayEmployeeInfo(Employee employee) {
    System.out.println(employee.getFirstName() + " " + employee.getLastName() + "'s yearly salary: $" + employee.getYearlySalary());
}
}

public class prac13 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("yashvi","gadhiya",250000);
        Employee e2 = new Employee("rutvi","gohil",200000);
        e1.displayEmployeeInfo(e1);
        e2.displayEmployeeInfo(e2);  
        e1.giveRaise();
        e2.giveRaise();
        e1.displayEmployeeInfo(e1);
        e2.displayEmployeeInfo(e2);
    }
}
