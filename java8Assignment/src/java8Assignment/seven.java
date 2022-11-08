package java8Assignment;
import java.util.Arrays;
import java.util.List;
	public class seven{
	public static void main(String[] args) {
	Integer[] Numbers= {11,12,22,15,86,55,33,64};
	//convert array to list
	List<Integer> numberList = Arrays.asList (Numbers);
	numberList.stream().filter(n -> n%2==0). forEach(System.out::println);
	}
}
