package Assignment;
import java.util.*;
class MaxOccuringCharacter{
	int stringMaximumCharacter(char[] str) {
		

		int countOfEcahCharacter[]=new int[256];
		int c=0;
		int max=0;
		
		for(int i=0;i<str.length;i++) {
			countOfEcahCharacter[str[i]]++;
			
		}
		
		for(int i=0;i<countOfEcahCharacter.length;i++) {
			if(countOfEcahCharacter[i]>max) {
				c=i;
				max=countOfEcahCharacter[i];
						
			}
			
		}
		
		return c;
		
	}
}
public class FourthAssignmentQuestion8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String to check");
       String str=sc.nextLine();
       char str1[] = str.toCharArray();
       
       MaxOccuringCharacter strings=new MaxOccuringCharacter();
       int ans=strings.stringMaximumCharacter(str1);
       if(ans>=65&&ans<=90) {
    	   ans=ans-65;
    	   char c=(char)('A'+ans);
    	   System.out.println(c);
       }
       else if(ans>=97&&ans<=122) {
    	   ans=ans-97;
    	   char c=(char)('a'+ans);
    	   System.out.println(c);
       }
       
      
	}
}

