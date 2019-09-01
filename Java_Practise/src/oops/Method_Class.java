package oops;

public class Method_Class {

	public static void main(String[] args) {
		Method_Class mc=new Method_Class();
		int Multi = mc.add(5, 6);
		String str = mc.twoString("Manoj", "Sarita");
		System.out.println(Multi);
		System.out.println(str);
	}
	
	public int add(int a,int b){
		int MulNum=a*b;
		return MulNum;
	}
	
	public String twoString(String a,String b){
		String addNum=a+b;
		return addNum;
	}

}
