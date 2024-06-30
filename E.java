import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        System.out.println("inputs from users");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entere number 1");
            int a = sc.nextInt();
            System.out.println("Enter Number 2");
            int b=sc.nextInt();
            // System.out.println("Enter number 3");
            // flote c=sc.nextFloat();
            int sum=a+b;
            
            System.out.println("the sum of this tow number is ");
            System.out.println(sum);
        }
       

    }
    
}
