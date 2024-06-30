/*
 * Task
 * Chef wants to appear in a competitive exam. To take the exam, there are
 * following requirements:
 * 
 * Minimum age limit is
 * �
 * X (i.e. Age should be greater than or equal to
 * �
 * X).
 * Age should be strictly less than
 * �
 * Y.
 * Chef's current Age is
 * �
 * A. Find whether he is currently eligible to take the exam or not.
 */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		int a = read.nextInt();
    		
    		// Update your code below this line solve the problem
    		
    		if(a>=x && a<y){
    		    System.out.println("YES");
    		}else{
    		    System.out.println("NO");
    		}
		}
	}
}