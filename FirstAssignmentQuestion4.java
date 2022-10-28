package Assignment;

public class FirstAssignmentQuestion4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=16;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if((i-j>(n-1)/2&&i>(n-1)/2)||(i+j>=n+(n-1)/2)||i==n-2){
		                System.out.print("*");
		            }else{
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
	}
}
