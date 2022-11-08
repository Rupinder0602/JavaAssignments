package java9andabove;
interface Use{  
    default void say() {  
        WriteSomething();  
    }  
     
    private void WriteSomething() {  
        System.out.println("Hello... I'm in private method");  
    }  
}  
public class PrivateInterface implements Use {  
    public static void main(String[] args) {  
        Use s = new PrivateInterface();  
        s.say();  
    }  
}  