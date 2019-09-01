package practise_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > " );
		int n=s.nextInt();
		factorial(n);
	}
	
	public static void factorial(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println(f);
	}

}
