
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no = sc.nextInt();
		
		
			if(no%2==0) {
				System.out.println("Even number");
			}
			else{
				System.out.println("odd");
			}
		
	}
}
