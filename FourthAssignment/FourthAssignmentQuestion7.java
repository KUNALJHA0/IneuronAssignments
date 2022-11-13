package Assignment;

import java.util.Scanner;

class UniqueCharacters{
	boolean stringContainsAllUniqueCgaractes(char[] str) {
		

		int countOfEcahCharacter[]=new int[256];
		
		for(int i=0;i<str.length;i++) {
			countOfEcahCharacter[str[i]]++;
			
		}
		
		for(int i=0;i<countOfEcahCharacter.length;i++) {
			if(countOfEcahCharacter[i]>1) {
				return false;
			}
			
		}
		
		return true;
		
	}
}
public class FourthAssignmentQuestion7 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1;
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the String");
	       String1=sc.nextLine();
	       
	      
		
		char str1[] = String1.toCharArray();
	    
		UniqueCharacters strings=new UniqueCharacters();
	    boolean b=strings.stringContainsAllUniqueCgaractes(str1);
	    if(b) {
	    	System.out.println("Yes All characters are unique");	
	    }
	    else {
	    	System.out.println("No All characters are not unique");
	    }
	}

}
