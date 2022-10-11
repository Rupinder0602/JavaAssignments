package Assignment3;

 
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Objects;
	 
	public class Question4{
		  private String name;
		    private int age;
		    private String designation;
	 
	 
		    public Question4(String name, int age, String designation) {
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
		        Question4 employee = (Question4) o;
		        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
		    }
	 
		    @Override
		    public int hashCode() {
		        return Objects.hash(name, age, designation);
		    }
		    
		    
	 
		    public static void main(String[] args){
		        HashMap<Question4,Integer> map=new HashMap<Question4, Integer>();
	 
	 
		        Question4 e=new Question4("Arjun",21,"Developer ");
		        Question4 e1=new Question4("Ranveer",60,"Project Manager");
		        Question4 e2=new Question4("Rajdeep",30,"Analyst");
		        Question4 e3=new Question4("Anurag",24,"devops");
		        Question4 e4=new Question4("Rupinder",22,"Quality Engineering");
	 
	 
		        map.put(e,6000);
		        map.put(e1,200000);
		        map.put(e2,1000);
		        map.put(e3,15000);
		        map.put(e4,20000);
	 
		        for(Map.Entry<Question4,Integer> key:map.entrySet()){
		            System.out.println(key + " Salary");
		        }
		    }
	 
	}


