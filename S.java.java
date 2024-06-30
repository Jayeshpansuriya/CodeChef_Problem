import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        System.out.println("This is a marksheet of CBSC exam");
        Object system;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of maths");
        int M = sc.nextInt();
        System.out.println("enter marks of science");
        int S = sc.nextInt();
        System.out.println("enter marks of hindi");
        int H = sc.nextInt();
        System.out.println("enter marks of english");
        int E = sc.nextInt();
        System.out.println("enter marks of gujratis");
        int G = sc.nextInt();
        System.out.println("enter marks of drawing");
        int D = sc.nextInt();
        System.out.println(" Totel marks  of student is : ");
        int T = (M+S+H+E+G+D);
        System.out.println("persentage of student: ");
        int P= (T/600)*100;
        System.out.println(P);
        

    }
}
