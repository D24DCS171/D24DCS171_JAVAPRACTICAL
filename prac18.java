/*Create a class named 'Member' having the following 
members: Data members 
1 - Name 2 - Age 3 - Phone number 4 - Address 5 – Salary 
It also has a method named 'printSalary' which prints the 
salary of the members. Two classes 'Employee' and 
'Manager' inherits the 'Member' class. The 'Employee' and 
'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone 
number, address and salary to an employee and a manager 
by making an object of both of these classes and print the 
same. */

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class prac18 {
    public static void main(String[] args) {
        Employee emp = new Employee("rutvi", 30, "123-456-7890", "123 Main St", 50000.0, "Software Development");
        Manager mgr = new Manager("yashvi", 45, "987-654-3210", "456 Elm St", 80000.0, "IT");

        System.out.println("Employee Details:");
        emp.display();

        System.out.println("\nManager Details:");
        mgr.display();
    }
}

