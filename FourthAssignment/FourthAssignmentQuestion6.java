package Assignment;

import java.util.Scanner;

class PanagramChecking{
	boolean PanagramCheckingOfString(String str) {
     int countOfEcahCharacter[]=new int[26];
	for(int i=0;i<str.length();i++) {
		int index=0;
		if('A' <= str.charAt(i)
                && str.charAt(i) <= 'Z') {
			index=str.charAt(i)-'A';
		}
		else if ('a' <= str.charAt(i)
                && str.charAt(i) <= 'z')

           {index = str.charAt(i) - 'a';}
		else {
			continue;
		}
		countOfEcahCharacter[index]++;
	}
     
     for(int i=0;i<countOfEcahCharacter.length;i++) {
    	 if(countOfEcahCharacter[i]<1) {
    		 return false;
    	 }
     }
     return true;
		
	}
}

public class FourthAssignmentQuestion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter The string characters.");
	    String str=sc.nextLine();
	    char[] arr = str.toCharArray();
	    PanagramChecking pana=new PanagramChecking();
	    boolean ans=pana.PanagramCheckingOfString(str);
	    if(ans) {
	    	System.out.println("Panagram");
	    
	    }
	    else {
	    	System.out.println("Not a Panagram");
	    
	    }
	    
	}

}
