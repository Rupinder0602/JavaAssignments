package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeQ4 {
	  private String name;
	    private int age;
	    private String designation;


	    public EmployeeQ4(String name, int age, String designation) {
	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "designation= " + designation + '\'' +
	                ", name=" + name +
	                ", age='" + age + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        EmployeeQ4 employee = (EmployeeQ4) o;
	        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, age, designation);
	    }
	    
	    

	    public static void main(String[] args){
	        HashMap<EmployeeQ4,Integer> map=new HashMap<EmployeeQ4, Integer>();


	        EmployeeQ4 e=new EmployeeQ4("Arjun",21,"Developer ");
	        EmployeeQ4 e1=new EmployeeQ4("Ranveer",60,"Project Manager");
	        EmployeeQ4 e2=new EmployeeQ4("Rajdeep",30,"Analyst");
	        EmployeeQ4 e3=new EmployeeQ4("Anurag",24,"devops");
	        EmployeeQ4 e4=new EmployeeQ4("Rupinder",22,"Quality Engineering");


	        map.put(e,6000);
	        map.put(e1,200000);
	        map.put(e2,1000);
	        map.put(e3,15000);
	        map.put(e4,20000);

	        for(Map.Entry<EmployeeQ4,Integer> key:map.entrySet()){
	            System.out.println(key + " Salary");
	        }
	    }

}


