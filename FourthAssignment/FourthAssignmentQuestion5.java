package Assignment;

import java.util.Scanner;
class AreTheyAnagram{
	boolean anagramOfEcahOther(char[] str1,char[] str2) {
		if(str1.length!=str2.length) {return false;}
		
		int countOfEcahCharacter[]=new int[256];
		
		for(int i=0;i<str1.length;i++) {
			countOfEcahCharacter[str1[i]]++;
			countOfEcahCharacter[str2[i]]--;
		}
		
		for(int i=0;i<countOfEcahCharacter.length;i++) {
			if(countOfEcahCharacter[i]!=0) {
				return false;
			}
			
		}
		
		return true;
	}
}

public class FourthAssignmentQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anagramString1 , anagramString2;
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the String1");
	        anagramString1=sc.nextLine();
	       
	       System.out.println("Enter the String2");
	       anagramString2=sc.nextLine();
		
		char str1[] = anagramString1.toCharArray();
	    char str2[] = anagramString2.toCharArray();
	    AreTheyAnagram strings=new AreTheyAnagram();
	    boolean b=strings.anagramOfEcahOther(str1, str2);
	    if(b) {
	    	System.out.println("Yes They are Anagram");	
	    }
	    else {
	    	System.out.println("No They are not angram of each other");
	    }
	    
	}

}
