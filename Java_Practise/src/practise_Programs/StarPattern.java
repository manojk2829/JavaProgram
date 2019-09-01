package practise_Programs;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        for(int i=1;i<=num;i++){
        	for(int j=1;j<=i;j++){
        		System.out.print(j);
        	}
        	System.out.println("");
        }

	}

}
