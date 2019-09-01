package practise_Programs;

public class Max_Two_Num_in_Array {

	public static void main(String[] args) {
		int n[] = {2,43,56,324,65,767,324,253};
		int s=n[0],l=n[0];
	   /* for(int num:a){
	    	if(m1<num){
	    		m2=m1;
	    		m1=num;
	    	}else if(m2<num){
	    		m2=num;
	    	}*/
	    	 for(int i=0;i<n.length;i++){
	         	if(s>n[i]){
	         		s=n[i];

	         	}else if(l<n[i]){
	         		l=n[i];
	         	}
	    }
	    System.out.println(s+" "+l);
	
	}

}
