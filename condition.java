import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        // System.out.println("if else condition ");
        // int age=90;
        // if(age>18){
        //     System.out.println("you can drive the car!");

        // }
        // else{
        //     System.out.println("you can not drive !");
             
            // System.out.println("logical operater");

            // System.out.println("and operator");
            // boolean a=true;
            // boolean b= false;
            // if (a && b){
                // System.out.println("yes");
            // }
            // else{
                // System.out.println("No");
            // }

            // System.out.println("OR operator");
            // if (a||b)
            // {
            //     System.out.println("yes");
            // }
            // else{
            //     System.out.println("no");
            // }

        //  System.out.println("NOT operator");
        //  System.out.println("this operaor will convert the actuall value of operand false-->true and turue-->false ");
        //   System.out.println("not (a)" + !a);
        //   System.out.println("not(b)" + !b);

        // int age;
        // System.out.println("enter your age");
        // Scanner sc= new Scanner(System.in);
        // age=sc.nextInt();
        // if(age>70){
        //     System.out.println("you are expireanced");
        // }
        // else if (age<36){
        //     System.out.println("YOU ARE SEMI EXPIREANCE");

        // }
        // else if (age<12){
        //     System.out.println("you are semi semi semi expireanced");
        // }
        // else{
        //     System.out.println("you are nit expireanced");
        // }

        System.out.println("switch case...");
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        int age;
        age = sc.nextInt();

        switch(age){
            case 18:
            System.out.println("you are going to adult");
            break;   
            case 23:
            System.out.println("you are going to job");
            break;
            case 70:
            System.out.println("congratse! you are going to retired");
            break;
            default:
            System.out.println("enjoi your life");
            break; 
            

        }


        // }
    }
}
