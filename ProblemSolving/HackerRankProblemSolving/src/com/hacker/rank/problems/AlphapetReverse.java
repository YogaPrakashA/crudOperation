package com.hacker.rank.problems;

public class AlphapetReverse {
	 public static void main(String[] args) {
		 String input = "hsakarp agoy";
	     
		 System.out.println("Before Sorting Value" +input);
		 
		 char temp ;
		 
		 char[] charas= input.toCharArray();
		 
		 for(int i =0; i < charas.length;i++) {
			 for(int j =0 ; j<charas.length;j++)
			 {
				 if(charas[i] < charas[j]) {
					 temp = charas[i];
					 charas[i] = charas[j];
					 charas[j] = temp;
					 
				 }
			 }
		 }
		 
		 System.out.println("After Sorting : ");
		 for(int k = 0; k <charas.length;k++) {
			 
			 System.out.println(charas[k]);
		 }
		 
		
	}
}
