package question.level2;

import java.util.Scanner;

public class _14681 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
		
    	int x;
    	x = sc.nextInt();
    	int y;
    	y = sc.nextInt();
		
    	if(x>0 && y>0)
    		System.out.println(1);
    	else if(x<0 && y>0)
    		System.out.println(2);
    	else if(x<0 && y<0)
    		System.out.println(3);
    	else if(x>0 && y<0)
    		System.out.println(4);
    	
		sc.close();
    }
}
