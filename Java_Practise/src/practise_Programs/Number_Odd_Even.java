package practise_Programs;

public class Number_Odd_Even {

	public static void main(String[] args) {
	   Is_Number_even_or_Odd(13);	
	}
	
	
	public static void Is_Number_even_or_Odd(int n){
		if(n%2==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	}
}
