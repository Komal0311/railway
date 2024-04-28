/*class Animal{
    public void makesound(){
        System.out.println("The animal makes a sound");
    }
}
 class Cat extends Animal{
    public void makesound(){
        System.out.println("The cat quarrels");
    }
}
public class Main{
    public static void main(String[] args){
        Animal animal=new Animal();
        Cat cat=new Cat();
        animal.makesound();
        cat.makesound();

    }
}*/

/*class Vehicle{
    public void drive(){
        System.out.println("Repairing a vehicle");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing a vehicle");
    }
}
public class Main{
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        vehicle.drive();
        car.drive();
    }
}*/

/* class Shape{
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    public double length;
    public double width;
public Rectangle(double length,double width){
this.length=length;
this.width=width;
}
public double getArea(){
return length*width;
}}
public class Main{
public static void main(String[] args){
Rectangle rectangle=new Rectangle(3.0,8.0);
double area=rectangle.getArea();
System.out.println("The area of the rectangle is:" +area);
}}*/
/*
class Employee{
String name;
int age;
String phone;
String address;
double salary;

public void printSalary(){
System.out.println("Salary:" + salary);
}
}
class Officer extends Employee{
String specialization;
public Officer(String name,int age,String phone,String address,double salary,String specialization){
this.name=name;
this.age=age;
     this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
}}

class Manager extends Employee {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phone = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;}}

class EmployeeDemo {
    public static void main(String[] args) {
        Officer officer = new Officer("John Doe", 30, "123-456-7890", "123 Main St, City", 60000.0, "Finance");
        Manager manager = new Manager("Jane Smith", 35, "987-654-3210", "456 Elm St, City", 80000.0, "HR");

        System.out.println("Officer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phone);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}*/

/*
class Employee{
        public void display(){
System.out.println("Name of class is Employee");
        }
public void calcSalary(){
System.out.println("Salary of employee is 10000");}
}
class Engineer extends Employee{
public void calcSalary(){
System.out.println("Salry of employee is 20000");
}
}
 class EmployeeDemo{
public static void main(String[] args){
Employee employee=new Engineer();
employee.display();
employee.calcSalary();
}}*/

