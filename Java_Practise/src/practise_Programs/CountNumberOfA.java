package practise_Programs;

public class CountNumberOfA {

	public static void main(String[] args) {
        int n[] ={32,54,546,34,654,324,4};
        int m1=0,m2=0;
        for(int i=0;i<n.length;i++){
        	if(m1<n[i]){
        		m2=m1;
        		m1=n[i];
        	}if(m2<n[i]){
        		m2=n[i];
        	}
        	
        }
        System.out.println(m1+"  "+m2);

 }
	public static void numberofChar(char ch){
		String s="manoj kusr r rhwaha sarita viraj subhi raaj";
	     int c=0;
	     for(int i=0;i<s.length();i++){
	    	 if(s.charAt(i)==ch){
	    		 c++;
	    	 }
	     }
	     if(c>1){
	     System.out.println("Number of Char --- > " + c);
		}
	}
}
