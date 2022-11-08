package java9andabove;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class new1234 {
  
    public static void main(String[] args)
    {
  
        
        Stream<Integer> stream
            = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
  
       
        List<Integer> list
            = stream.dropWhile(number -> (number / 4 == 1))
                  .collect(Collectors.toList());
  
        
        System.out.println(list);
        
        	 Stream<Integer> stream1
             = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
   
        
         List<Integer> list1
             = stream1.takeWhile(number -> (number / 4 == 1))
                   .collect(Collectors.toList());
         System.out.println(list1);
    
    }
}
