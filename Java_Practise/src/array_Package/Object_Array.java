package array_Package;

public class Object_Array {

	public static void main(String[] args) {
		Object[][] d=new Object[2][3];
		d[0][0] ="manoj";
		d[0][1] = 2;
		d[0][2] = 'A';
		
		d[1][0] ="Sarita";
		d[1][1] = 3;
		d[1][2] = null;
		
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[0].length;j++){
				System.out.print(d[i][j]+ " | ");
			}
			System.out.println("");
		}
	}
}
