package Lab2_3;

public class Employee {
private String id;
private String name;
private double salary;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
}

public void display() {
	System.out.println("ID: "+getId());
	System.out.println("Name: "+getName());
	System.out.println("Salary: "+getSalary());
}


}
