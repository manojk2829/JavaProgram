package practise_Programs;

public class Count_Num_char {

	public static void main(String[] args) {
		int c=0;
		String s="Manoj RrSystems ABC viraj sarita";
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(ch[i]=='r'){
				c++;
			}
		}if(c>0){
			System.out.println("Number of Char in String --- > " + c);
		}
	}

}
