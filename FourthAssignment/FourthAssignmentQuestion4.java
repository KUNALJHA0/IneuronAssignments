package Assignment;

import java.util.Scanner;

public class FourthAssignmentQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The string characters.");
	    String str=sc.nextLine();
	    int vowel=0,consonant=0,specialCharacter=0;
	    for(int i=0;i<str.length();i++) {
	    	if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
	    		
	    		vowel++;
	    	}
	    	else if ('a' <= str.charAt(i)
	                && str.charAt(i) <= 'z')

	           {consonant++;}
	    	else if ('A' <= str.charAt(i)
	                && str.charAt(i) <= 'Z')

	           {consonant++;}
	    	else {
	    		specialCharacter++;
	    	}
	    	
	    }
	    
	    System.out.println("Vowels = "+ vowel);
	    System.out.println("Consonant = "+ consonant);
	    System.out.println("Special Characters = "+ specialCharacter);
	    
	}

}
