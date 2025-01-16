import java.util.Scanner;

public class prac21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int num;
        int oddsum=0;
        int evensum=0;

        while(true){
        num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num %2==0){
                evensum=num+evensum;
            }else{
                oddsum=num+oddsum;
            }
        }
        System.out.println("Sum of even integer is"+ evensum);
        System.out.println("Sum of odd integer is"+ oddsum);

    }
}
