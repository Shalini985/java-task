package com.xwork.taskapp;

import java.util.Scanner;

public class StringSpace {
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the white space");
		String s=sc.nextLine();

		int count=0;
		char[]g=s.toCharArray();
		for(int i=0;i<g.length;i++) {
			if(g[i]==' ') {
				count+=1;
				continue;
			}
			//else {
				System.out.print(g[i]);
			//}
		}
		System.out.println();
		System.out.println("number of white space"+count);
				

		
	}

}

