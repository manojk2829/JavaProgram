package practise_Programs;

import java.util.Scanner;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to check Prime or Not -- > ");
		int n = s.nextInt();
		System.out.println("Number is Prime -- " + getPrimeNumber(n));
		PrintPrimeNumber(120);
		
	}
	
	public static boolean getPrimeNumber(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void PrintPrimeNumber(int n){
		for(int i=2;i<=n;i++){
			if(getPrimeNumber(i)){
				System.out.println(i);
			}
		}
	}

}
