package javatopic;

import java.util.Scanner;

public class faboca {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the num: ");
		num=in.nextInt();
		
		    int f1,f2=0,f3=1;
		    
		    for(int i=1;i<=num;i++) {
		    	System.out.println(f3+" ");
		    	f1=f2;
		    	f2=f3;
		    	f3=f1+f2;
		    }
		

	}

}
