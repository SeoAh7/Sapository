package question.level3;
import java.util.Scanner;

public class _2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("");
		n = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {           //i: 0 1 2   i<3
			
			for (int j=1 ; j<=i+1 ; j++) {   //j<=i+1 : 1 2 3 
				
				System.out.printf("*");
				
			}
			System.out.println();
		}
		
		sc.close();
	}	
		
}

