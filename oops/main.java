class Person {
    String name;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    void showDetails(){
        System.out.println("Name is: " + name);
        System.out.println("Age of " + name + " is " + age);
    }
}

class Employee extends Person {
    String company;

    Employee(String name , int age , String company){
        super(name, age); 
        this.company = company;
    }

    void showEmployeeDetails(){
        showDetails();  
        System.out.println("Company name is: " + company);
    }
}

public class main {
    public static void main(String[] args) {
        Employee emp = new Employee("Ashish", 20, "Edument");
        emp.showEmployeeDetails();
    }
}
