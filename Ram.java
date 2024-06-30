import java.util.Scanner;
public class  Ram {
    public static void main(String[] args) {  
        //result in intiger                                  
        System.out.println("This is a marksheet of CBSC exam");
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
        System.out.println(T);
        System.out.println("persentage of student: ");
        int P= (T/600)*100;
        System.out.println(P);
    
      //result in float 
    //     System.out.println("This is a marksheet of CBSC exam");
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("enter marks of maths");
    //     float M = sc.nextInt();
    //     System.out.println("enter marks of science");
    // float S = sc.nextFloat();
    //     System.out.println("enter marks of hindi");
    //     float H = sc.nextFloat();   
    //     System.out.println("enter marks of english");
    //     float E = sc.nextFloat();
    //     System.out.println("enter marks of gujratis");
    //     float G = sc.nextFloat();
    //     System.out.println("enter marks of drawing");
    //  float D = sc.nextFloat();
    //     System.out.println(" Totel marks  of student is : ");
    //     float T = (M+S+H+E+G+D);
    //     System.out.println(T);
    //     System.out.println("persentage of student: ");
    //     float P= (T/600)*100;
    //     System.out.println(P);
      //  System.out.println();
    }
}
