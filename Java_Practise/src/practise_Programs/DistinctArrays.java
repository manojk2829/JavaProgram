package practise_Programs;

public class DistinctArrays {

	public static void main(String[] args) {
       int n[] ={34,6,3,6,34,65,4,67,3};
       for(int i=0;i<n.length;i++){
    	   boolean isDistinct=false;
    	   for(int j=0;j<i;j++){
    		   if(n[i]==n[j]){
    			   isDistinct=true;
    			   break;
    		   }
    	   }
    	   if(!isDistinct){
    	   System.out.print(n[i]+",");
    	   }
       }

	}

}
