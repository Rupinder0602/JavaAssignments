package java8Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
	 String Fullname,city;
	    long salary;
	    public Employee(String name,String city,long salary) {
	        this.Fullname = name;
	        this.city = city;
	        this.salary = salary;
	 
	    }
	    public long getSalary() {
	        return this.salary;
	    }
	 
	    public String getName() {
	        return this.Fullname;
	    }
	 
	    public String getCity() {
	        return this.city;
	    }
	    public static void main(String[] args) {
	        List<Employee> list = new ArrayList<Employee>();
	        list.add(new Employee("Rupinder Kaur","Delhi",3000));
	        list.add(new Employee("Ranveer Singh Tomar","Delhi",1200000));
	        list.add(new Employee("Rajdeep Singh","Delhi",5000));
	        list.add(new Employee("Ramesh Singh","Rajasthan",10000));
	        list.add(new Employee("Suresh Ag","Jaipur",2000));
	        list.add(new Employee("Dhruv Johari","Delhi",4000));
	        list.add(new Employee("Kunal Singh","Mumbai",21000));
	        list.add(new Employee("Hemant Saxena","Delhi",2000));
	 
	        List<String> emp1List = list.stream()
	                .filter(e-> e.getCity().equals("Delhi"))
	                .distinct()
	                .filter(e ->e.getSalary() < 5000)
	                .map(e -> e.getName())
	                .toList();
	        System.out.println(emp1List);
	 
	 
	 
	    }
	    @Override
	    public int hashCode()
	    {
	        return Objects.hash(city,Fullname,salary);
	 
	    }
	    @Override
	    public boolean equals(Object obj)
	    {
	        if(this==obj)
	            return true;
	        if(obj==null)
	            return false;
	        if(getClass() !=obj.getClass())
	            return false;
	        Employee other = (Employee) obj;
	        return Objects.equals(city, other.city)&&Objects.equals(Fullname, other.Fullname)&&Objects.equals(salary, other.salary);
	    }
	    @Override
	    public String toString()
	    {
	        return "Employee[name="+ Fullname +",age="+ city +",salary="+ salary +"]";
	    }
	}


