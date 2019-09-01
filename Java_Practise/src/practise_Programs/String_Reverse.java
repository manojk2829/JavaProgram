package practise_Programs;

public class String_Reverse {

	public static void main(String[] args) {
		String s="manoj Kushwaha";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		System.out.println();
		reverse("Manoj Sarita");
	}
	
	public static void reverse(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}

}
