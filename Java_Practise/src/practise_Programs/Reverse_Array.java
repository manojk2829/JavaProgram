package practise_Programs;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int a[] = {2,43,65,23,56,58,7,3454};
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+",");
		}
	  System.out.println();
	  System.out.println("Print Same Array --- > " + Arrays.toString(a));	

	  String s[] = {"ew","324","34dfs","sdad"};
	  for(int i=s.length-1;i>=0;i--){
			System.out.print(s[i]+",");
		}
	  System.out.println();
	  System.out.println("Print Same Array --- > " + Arrays.toString(a));	
      
	  for(int i=0;i<s.length;i++){
		  System.out.print(s[i]+",");
	  }
	  
	}	
}