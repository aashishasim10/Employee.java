package EmployeeForCompany.com;

import java.util.Comparator;

public class Employees implements Comparable<Employees>{
private String name;
private int id;
private String department;
private int salary;
private int experience;


public Employees() {
	super();
	name="AAshish";
	id=12783;
	department="JAVA";
	salary=1200000;
	experience=5;
	
}


public Employees(String name,int id,String department, int salary, int experience) {
	super();
	this.name = name;
	this.id=id;
	this.department = department;
	this.salary = salary;
	this.experience = experience;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}

public void setId(int id) {
	this.id =id;
}
public int getId() {
	return id;
}

public int getExperience() {
	return experience;
}


public void setExperience(int experience) {
	this.experience = experience;
}





@Override
public int compareTo(Employees o) {
	
	return this.id-o.id;
}





}
