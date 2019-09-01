package practise_Programs;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		int n=s.nextInt();
		number(n);
	}
	
	public static void number(int n){
		// Update this file again ---->
		int r,sum=0,temp;
		temp =n;
		while(n>0){
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Number is Armstrong");
		}else{
			System.out.println("Number is NOT ArmStrong");
		}
		
	}
}
