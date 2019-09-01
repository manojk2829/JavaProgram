package practise_Programs;

public class ReverseClass {

	public static void main(String[] args) {
        logical_Reverse(56789);
        intReverse(1234567);
	}
	
	public static void intReverse(long n){
		String SS=String.valueOf(n);
		StringBuffer sb=new StringBuffer(SS);
		System.out.println(sb.reverse());
	}
	
	public static void logical_Reverse(int n){
		int reverse=0;
		while(n!=0){
			int digit = n%10;
			reverse = reverse*10+digit;
			n=n/10;
		}
		System.out.println("Number is reveresed --- > " + reverse);
	}
	
	public static void logical_String_Reverse(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
		
	
	}

}
