package practise_Programs;

import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		int n=s.nextInt();
		number(n);
	}
	
	public static void number(int n){
		int r,sum=0,temp;
		temp =n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Number is palindrom");
		}else{
			System.out.println("Number is NOT palindrom");
		}
		
	}

}
