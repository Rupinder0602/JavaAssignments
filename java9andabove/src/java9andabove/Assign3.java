package java9andabove;
//import java.util.stream.IntStream;
//public class Assign3 {
//	    public static void main(String[] args) {
//	        IntStream.iterate(0, i->i<10, i->i+1).forEach(System.out::println);
//	    }
//	}
//
//import java.util.Optional;
//import java.util.stream.IntStream;
//
//public class Assign3 {
//    public static void main(String[] args) {
//        IntStream.rangeClosed(1,10)
//                .filter(e->e>20)
//                .findFirst()
//                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));
//
//        IntStream.rangeClosed(1,10)
//                .filter(e->e>20)
//                .boxed()
//                .findFirst()
//                .or(()-> Optional.of(-1))
//                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));
//
//        IntStream.rangeClosed(1,10)
//                .filter(e->e>20)
//                .findFirst()
//                .orElseThrow();
//    }
//}
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class Assign3 {
//    public static void main(String[] args) {
//        System.out.println(List.of(1,2,3,4,5,6,7,8,9));
//        System.out.println(Set.of(1,2,3,4,6,7,8,9));
//        System.out.println(Map.of(1,2,3,4,5,6,7,8));
//    }
//}
//import java.util.stream.IntStream;
//
//
//class Music implements AutoCloseable{
//    public Music() {
//        System.out.println("Music Queued");
//    }
//
//    public void start() {
//        System.out.println("Music Started");
//    }
//
//    @Override
//    public void close() throws Exception {
//        System.out.println("Music stop method invoked");
//    }
//}
//
//public class Assign3 {
//    public static void main(String[] args) throws Exception {
//        Music Music1 = new Music();
//
//        try(Music1){
//            Music1.start();
//
//        }catch (Exception ex){
//
//        }
//    }
//}

//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Assign3 {
//    public static void main(String[] args) {
//        List<Integer> integerList = Stream.of(1,2,3,4,5).filter(e->e<5)
//                .collect(Collectors.toUnmodifiableList());
//
//        System.out.println(integerList);
////        integerList.add(6);
//    }
//}



//import javax.swing.*;
//import javax.swing.event.ListDataEvent;
public class Assign3 {
    public static void main(String[] args) {

        System.out.println("REPEAT EXAMPLE");
        String string = "My name is Rupinder Kaur!!!";
        System.out.println(string.repeat(3));

        System.out.println("\nTRIM EXAMPLE");
        String whiteSpaceString = "    \n Helllo There     \n";
        System.out.println(whiteSpaceString.trim());

        System.out.println("\nSTRIP EXAMPLE");
        String unicodeSpaceString = "\u2005\u2005helllo There     \n";
        System.out.println("Before Strip = "+unicodeSpaceString);
        System.out.println("After Strip = "+whiteSpaceString.strip());

        System.out.println("\nISBLANK EXAMPLE");
        String isBlankString = "   ";
        System.out.println(isBlankString.isBlank());

        System.out.println("\nINDENT EXAMPLE");
        String s = "This is my sentence.";
        System.out.println(s);
        s=s.indent(10);
        System.out.println(s);
        s=s.indent(-5);
        System.out.println(s);

        System.out.println("\nTRANSFORM EXAMPLE");
        String transformMethod = string.transform(stringTemp ->new StringBuilder(stringTemp).reverse()
                .toString());
        System.out.println(transformMethod);

        System.out.println("\nSTRIP INDENT EXAMPLE");
        String stripString = "    Hello There Strip the Indent";
        stripString = stripString.stripIndent();
        System.out.println(stripString);

        System.out.println("\nTRANSLATE ESCAPES EXAMPLE");
        String str = "\"Hello\\nThere\"";
        System.out.println(str.translateEscapes());

        System.out.println("\nFORMATTED STRING EXAMPLE");
        System.out.println(String.format("I am Rupinder%s","Kaur"));
    }
}