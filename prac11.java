import java.util.*;
public class prac11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long year=sc.nextInt();
        if(year %4==0 && year%100!=0 || year%400==0) {
            System.out.println("The Year is Leap year");
        }
       else{
            System.out.println(year+"is not a leap year");
        }
    }
}
