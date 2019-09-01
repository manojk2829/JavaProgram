package practise_Programs;

public class Small_Large_value {

	public static void main(String[] args) {
		int a[] = {32,43,54,32,5,656,23,343,556,33};
	    int small = a[0];
	    int large = a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>large){
				large=a[i];
			}else if(a[i]<small){
				small=a[i];
			}
		}
		System.out.println("Small --- " + small +"  "+ "Large --- > " + large);
	}
}
