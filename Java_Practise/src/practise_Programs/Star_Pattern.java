package practise_Programs;

public class Star_Pattern {

	public static void main(String[] args) {
		
		/*star2(7);
		star_Reverse(8);
		star1(8);
		star_Reverse(8);
		star1(8);
		*/
		star1_Reverse(7);
		star(7);
	}
	
	public static void star1_Reverse(int n){
		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void star2(int n){
		for(int i=n;i>=0;i--){
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void star(int n){
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	public static void star1(int n){
        for(int i=1;i<=n;i++){
        	for(int j=n-i;j>=1;j--){
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++){
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
	
	public static void star_Reverse(int n){
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
