package com.xwork.taskapp;

import java.util.Scanner;

public class ReverseGood {

	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reverse the String");
		String s=sc.nextLine();
		String word=sc.next();
		String reverse = "" ;
		String[] str=s.split(" ");
		
	
          for(int i=0;i<str.length;i++) {
        	  if(str[i].equals(word)) {
        		  char ch[]=word.toCharArray();
        		  for(int j=word.length()-1;j>=0;j--) {
        			  reverse=reverse+ch[j];
        		  }
        		  str[i]=reverse;
        	  }
		
          }
          for(int i=0;i<str.length;i++) {
        	  System.out.print(str[i]+" ");
          }
          char[]g=s.toCharArray();
  		for(int i=0;i<g.length;i++) {
  			if(g[i]==' ') {
  				int count = 1;
  				continue;
  			}
  			//else {
  				System.out.print(g[i]);
	}
	}
}
	
          