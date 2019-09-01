package oops;

public class Local_Globle_Variable {
     int i=10;
     String str = "Sarita";
     static String str1 = "Manavi"; 
	public static void main(String[] args) {
	   int i=20;
	   String str = "Manoj";
	   Local_Globle_Variable l=new Local_Globle_Variable();
	   System.out.println(i);
       System.out.println(str);
	   System.out.println(l.i);
	   System.out.println(l.str);
	   System.out.println(str1);
	}

}
