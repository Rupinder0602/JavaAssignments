package Assignment4.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
 
public class Question4_2 {
	 String Fullname,city;
	    long salary;
	    public Question4_2(String name,String city,long salary) {
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
	        List<Question4_2> list = new ArrayList<Question4_2>();
	        list.add(new Question4_2("Rupinder Kaur","Delhi",3000));
	        list.add(new Question4_2("Ranveer Singh Tomar","Delhi",1200000));
	        list.add(new Question4_2("Rajdeep Singh","Delhi",5000));
	        list.add(new Question4_2("Ramesh Singh","Rajasthan",10000));
	        list.add(new Question4_2("Suresh Ag","Jaipur",2000));
	        list.add(new Question4_2("Dhruv Johari","Delhi",4000));
	        list.add(new Question4_2("Kunal Singh","Mumbai",21000));
	        list.add(new Question4_2("Hemant Saxena","Delhi",2000));
	 
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
	        Question4_2 other = (Question4_2) obj;
	        return Objects.equals(city, other.city)&&Objects.equals(Fullname, other.Fullname)&&Objects.equals(salary, other.salary);
	    }
	    @Override
	    public String toString()
	    {
	        return "Question4_2[name="+ Fullname +",age="+ city +",salary="+ salary +"]";
	    }
	}

