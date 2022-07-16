import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		int n1,n2;
	       Scanner S= new Scanner(System.in);
	       System.out.println("Enter the first number");
	       n1= S.nextInt();
	       System.out.println("Enter the Second number");
	       n2= S.nextInt();
	      System.out.println("Addition is "+(n1+n2));
	      System.out.println("Subtraction is "+(n1-n2));
	      System.out.println("Multiplication is "+(n1*n2));
	      System.out.println("Division is "+(n1/n2));
	      System.out.println("Reminder is "+(n1%n2));

	}

}
