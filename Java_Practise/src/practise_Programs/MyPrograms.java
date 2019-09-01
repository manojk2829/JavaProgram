package practise_Programs;

import java.util.Arrays;

public class MyPrograms {
   public static void main(String[] args){
      int n=6;
      int fact=1;
      for(int i=1;i<=n;i++){
    	  fact=fact*i;
      }
      System.out.println(fact);
	  System.out.println(factNum(5));

   }
   
   public static int factNum(int num){
	   if(num==1)
		   return 1;
	   else
		   return(num*factNum(num-1));
	   }
   }	

