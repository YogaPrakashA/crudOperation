package com.hacker.rank.problems;


interface Drawable{  
    public void draw(int n);  
}  

public class Predicate {
	public static void main(String[] args) {
		int width=10;  
        
        //with lambda  
        Drawable d2=(n)->{  
        	  int a = n+width;
            System.out.println("Drawing "+width + " "+a);  
        };  
        d2.draw(10);  
    
	
		
	}
}
