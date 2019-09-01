package array_Package;

public class Array_Class {

	public static void main(String[] args) {
		int a[] = {10,3,5,2,5,52,54,435,2,33,1};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" | ");
		}
		System.out.println("");
		
		for(int j=a.length-1;j>=0;j--){
			System.out.print(a[j]+" , ");
		}
		
		System.out.println("");
		String s[] =new String[4];
		s[0]="manoj";
		s[1]="sarita";
		s[2]="viraj";
		s[3]="manavi";
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" | ");	
		}
		System.out.println(" ");
		for(int i=s.length-1;i>=0;i--){
			System.out.println(s[i]);
		}
	}

}
