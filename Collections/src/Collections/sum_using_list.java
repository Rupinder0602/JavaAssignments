package Collections;
	import java.util.*;
	import java.io.*;
	public class sum_using_list {
	        public static void main(String[] args)
	        {
	            List<Double> list = new ArrayList<>();
	            list.add(3.36);
	            list.add(1.36);
	            list.add(5.36);
	            list.add(9.56);
	            list.add(52.25);
	            System.out.println("The number entered in the array list are"+list);
	            int sum = 0;
	            for (int i = 0; i < list.size(); i++)
	                sum += list.get(i);
	            System.out.println("sum-> " + sum);
	        }
	    }

