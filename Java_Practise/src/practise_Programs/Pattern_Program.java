package practise_Programs;

public class Pattern_Program {

	public static void main(String[] args) {
/***
 * 123456
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 */
        int n=7;
        for(int i=n;i>=1;i--){
        	for(int j=1;j<=i;j++){
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
        for(int j=1;j<=n;j++){
        	for(int k=1;k<=j;k++){
        		System.out.print(k+" ");
        	}
        	System.out.println();
        }

	}
}
