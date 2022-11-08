package Collections;
 
	import java.util.*;
	 
	public class Employee extends Number implements Comparator<String>{
	    private  String fname;
	    private  String lname;
	    private double age;
	    private int salary;
 
	    public Employee(String fname, String lname, double age, int salary) {
	        this.fname = fname;
	        this.lname = lname;
	        this.age = age;
	        this.salary = salary;
	    }
	    public static final Comparator<Employee> Firstname = new Comparator<Employee>(){
 
	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.fname.compareTo(o2.fname);
	        }
 
	    };
	    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){
 
 
	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return  (e1.salary- e2.salary);
	        }
	    };
	    @Override
	    public String toString() {
	        return "Employee{" +
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
	        Employee employee = (Employee) o;
	        return Double.compare(employee.age, age) == 0 && Double.compare(employee.salary, salary) == 0 && fname.equals(employee.fname) && lname.equals(employee.lname);
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
	        Employee emp = new Employee("Aditya", "Tomar", 22, 10000);
	        Employee emp2 = new Employee("Rajdeep", "Singh", 30, 10500);
	        Employee emp3 = new Employee("Shalini", "Singh", 33, 400);
	        Employee emp4 = new Employee("Kanchan", "Singh", 35, 200000);
 
	        ArrayList<Employee> li = new ArrayList<Employee>();
	        li.add(emp);
	        li.add(emp2);
	        li.add(emp3);
	        li.add(emp4);
	        System.out.println("Sorting based on Salary\n");
	        Collections.sort(li,SalaryComparator);
	        for(Employee em:li){
	            System.out.println(em);
	        }
	        System.out.println("\nSorting based on Firstname\n");
	        Collections.sort(li,Firstname);
	        for(Employee em:li){
	            System.out.println(em);
	        }
	    }
	}
