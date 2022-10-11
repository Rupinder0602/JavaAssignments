package Assignment3;


	import java.util.*;
	 
	public class Question2 extends Number implements Comparator<String>{
	    private  String fname;
	    private  String lname;
	    private double age;
	    private int salary;
 
	    public Question2(String fname, String lname, double age, int salary) {
	        this.fname = fname;
	        this.lname = lname;
	        this.age = age;
	        this.salary = salary;
	    }
	    public static final Comparator<Question2> Firstname = new Comparator<Question2>(){
 
	        @Override
	        public int compare( Question2 o1,  Question2 o2) {
	            return o1.fname.compareTo(o2.fname);
	        }
 
	    };
	    public static final Comparator<Question2> SalaryComparator = new Comparator<Question2>(){
 
 
	        @Override
	        public int compare(Question2 e1, Question2 e2) {
	            return  (e1.salary- e2.salary);
	        }
	    };
	    @Override
	    public String toString() {
	        return "Question2{" +
	                "fname='" + fname + '\'' +
	                ", lname='" + lname + '\'' +
	                ", age=" + age +
	                ", salary=" + salary +
	                '}';
	    }
 
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Question2 Question2 = (Question2) o;
	        return Double.compare(Question2.age, age) == 0 && Double.compare(Question2.salary, salary) == 0 && fname.equals(Question2.fname) && lname.equals(Question2.lname);
	    }
 
	    @Override
	    public int hashCode() {
	        return Objects.hash(fname, lname, age, salary);
	    }
 
	    @Override
	    public int compare(String o1, String o2) {
	        return o1.compareTo(o2);
	    }
 
	    @Override
	    public int intValue() {
	        return 0;
	    }
 
	    @Override
	    public long longValue() {
	        return 0;
	    }
 
	    @Override
	    public float floatValue() {
	        return 0;
	    }
 
	    @Override
	    public double doubleValue() {
	        return 0;
	    }
 
	    public static void main(String[] args) {
	    	 Question2 emp = new  Question2("Aditya", "Tomar", 22, 10000);
	    	 Question2 emp2 = new  Question2("Rajdeep", "Singh", 30, 10500);
	    	 Question2 emp3 = new  Question2("Shalini", "Singh", 33, 400);
	        Question2 emp4 = new  Question2("Kanchan", "Singh", 35, 200000);
 
	        ArrayList< Question2> li = new ArrayList< Question2>();
	        li.add(emp);
	        li.add(emp2);
	        li.add(emp3);
	        li.add(emp4);
	        System.out.println("Sorting based on Salary\n");
	        Collections.sort(li,SalaryComparator);
	        for( Question2 em:li){
	            System.out.println(em);
	        }
	        System.out.println("\nSorting based on Firstname\n");
	        Collections.sort(li,Firstname);
	        for( Question2 em:li){
	            System.out.println(em);
	        }
	    }
	}

