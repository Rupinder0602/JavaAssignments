package java9andabove;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//public class assignment3 {
//    public static void main(String[] args) {
//        System.out.println(IntStream.rangeClosed(0,15)
//                .boxed()
//                .collect(Collectors.toList()));
//    }
//}
//record Student(String name,int id, int age){
//    static int counter = 0;
//    public Student(String name, int id, int age) {
//        this.name = name;
//        this.id = id;
//        this.age = age;
//        counter++;
//    }
//
//}
//public class assignment3 {
//    public static void main(String[] args) {
//        Student student1 = new Student("Rupinder",191,22);
//        Student student2 = new Student("Shivam",102,21);
//        System.out.println(student1);
//        System.out.println(student1.age());
//        System.out.println(student1.id());
//        System.out.println(student1.name());
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student1.equals(student2));
//        System.out.println(Student.counter);
//    }
//}
//sealed class Person permits Doctor, Teacher {
//    void display(){
//        System.out.println("Person is A sealed class.");
//    }
//}
//
//final class Doctor extends Person{}
//
//sealed class Teacher extends Person permits MathsTeacher{}
//
//non-sealed class MathsTeacher extends Teacher{
//    void display(){
//        System.out.println("Maths Teachers are Great.");
//    }
//}
//
//public class assignment3 {
//    public static void main(String[] args) {
//        MathsTeacher mathsTeacher = new MathsTeacher();
//        mathsTeacher.display();
//    }
//
//}



import java.util.Arrays;
import java.util.List;

public class assignment3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        integerList.stream()
                .filter(e->e>5)
                .findFirst()
                .stream()
                .forEach(System.out::println);
    }
}