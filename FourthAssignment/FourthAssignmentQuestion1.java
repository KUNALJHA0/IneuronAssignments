package Assignment;

import java.util.*;
import java.util.Scanner;

class RemoveDuplicateCharacters{
	void removeDuplicate(String str) {
		char str1[] = str.toCharArray();
		//Arrays.sort(str1);
		String ans="";
		String duplicate="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			//str.lastIndexOf(c,str.length()):- This function will return the last occurence of character from given index to 0 , that is it will search backward.
			
			if(str.lastIndexOf(c,str.length())<0||str.lastIndexOf(c,str.length())==i) {
				ans+=str.charAt(i);
			}else {
				duplicate+=str.charAt(i);
			}
		}
		System.out.println("String without Duplicate characters is :- "+ans);
		System.out.println("The Duplicate Characters of String are :- "+duplicate);
   }
}

public class FourthAssignmentQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the String to check");
	       String str=sc.nextLine();
	       RemoveDuplicateCharacters rem=new RemoveDuplicateCharacters();
	       rem.removeDuplicate(str);
	}

}