package question.level3;
import java.util.Scanner;

public class _2442 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
		
    	int n;
    	n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int k=0; k<(n*2-1); k++)
			{
				if((n-i-1)<=k && (n+i)>k)
					System.out.print("*");
				else if((n-i-1)>k)
					System.out.print(" ");
			}
		
			System.out.println();
		}
    
		sc.close();
    }
}
