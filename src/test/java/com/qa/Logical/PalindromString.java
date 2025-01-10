package com.qa.Logical;

import java.util.Scanner;

public class PalindromString {
   public static void main(String[] args) {
	   System.out.println("Enter The String ");
	   Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 s=s.toLowerCase();
	 String rev="";
	 
	 String temp=s;
	 for(int i=s.length()-1;i>=0;i--) {
		 rev=rev+s.charAt(i);
	 }
	 System.out.println(rev);
	 if(temp.equals(rev)) {
		 System.out.println("palindrom string");
	 }
	 else {
		 System.out.println("not a palindrom");
	 }
	 System.out.println("====after boss permission code updated=====");
}
}
