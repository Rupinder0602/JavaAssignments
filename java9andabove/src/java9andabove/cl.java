package java9andabove;
import java.util.*;
import java.util.stream.IntStream;
  
class cl {

	    public static void main(String[] args)
	    {

	       
	        Optional<Integer> op
	            = Optional.of(9455);
	        Optional<Integer> op1
            = Optional.of(9455);
	     
	        System.out.println("Optional: " 
	                        + op);

	      
	        op.ifPresentOrElse(
	            (value)
	                -> { System.out.println(
	                        "Value is present, its: "
	                        + value); },
	            ()
	                -> { System.out.println(
	                        "Value is empty"); });

	        // create a Optional
	        Optional<Integer> op2
	            = Optional.of(9455);

	        // print supplier
	        System.out.println("Optional: "
	                        + op2);

	        // orElseThrow supplier
	        System.out.println(
	            "Value by orElseThrow("
	            + "ArithmeticException::new) method: "
	            + op2.orElseThrow(
	                ArithmeticException::new));
	    }
	
}