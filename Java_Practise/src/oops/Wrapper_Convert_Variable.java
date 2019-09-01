package oops;

public class Wrapper_Convert_Variable {

	public static void main(String[] args) {
		String s="100";
		int i=200;
		int a = Integer.parseInt(s);
		System.out.println(a+i);
		
		
		String s1="25.99";
		double dd = Double.parseDouble(s1);
		System.out.println(dd+i);
		
		int r=200;
		String str="100";
		String ss = String.valueOf(r);
		System.out.println(str+ss);
		
		int aaa=Integer.parseInt(str);
		System.out.println(aaa+r);
		
		
		
	}

}
