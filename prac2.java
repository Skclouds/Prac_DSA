import com.sun.tools.jconsole.JConsoleContext;

public class prac2 {
    public static void main(String[] args) {
        int age=31;

        if(age>=18){
            System.out.println("User can drive and vote");
        } else if (age>=13 && age<18) {
            System.out.println("He is Teenager");
        }
        else {
            System.out.println("He is not yet younger");
        }
    }
}
