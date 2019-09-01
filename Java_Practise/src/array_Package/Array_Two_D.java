package array_Package;

public class Array_Two_D {

	public static void main(String[] args) {
		int a[][] = new int[3][4];
		a[0][0]=88;
		a[0][1]=81;
		a[0][2]=82;
		a[0][3]=83;
		
		a[1][0]=10;
		a[1][1]=11;
		a[1][2]=12;
		a[1][3]=13;
		
		a[2][0]=20;
		a[2][1]=21;
		a[2][2]=22;
		a[2][3]=23;
		
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" | ");
			}
			System.out.println("");
		}
		
				
				
		
	}

}
