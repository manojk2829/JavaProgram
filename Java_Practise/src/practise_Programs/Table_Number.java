package practise_Programs;

import java.util.Scanner;

public class Table_Number {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Number -- > " );
			int n=s.nextInt();
			Table(n);
		}
		
		public static void Table(int n){			
			
		for(int i=1;i<=10;i++){
			int	T=n*i;
			System.out.println(T);
		}
	}
}
