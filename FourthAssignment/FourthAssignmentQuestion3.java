package Assignment;
import java.util.*;
class IsPallindromeString{
	boolean stringIsPallindrome(String str){
		for(int i=0,j=str.length()-1;i<str.length();i++,j--) {
	    	   if(str.charAt(i)!=str.charAt(j)) {
	    		   return false;
	    	   }
	    	   
	       }
		return true;
	}
}
public class FourthAssignmentQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String to check");
       String str=sc.nextLine();
       
       IsPallindromeString string=new IsPallindromeString();
       boolean ans=string.stringIsPallindrome(str);
       if(ans==false) {
    	   System.out.print("Not a Pallindrome");
       }
       else {
    	   System.out.print("Pallindrome"); 
       }
	}

}
