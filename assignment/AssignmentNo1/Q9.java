import java.util.Scanner;
class Pytha{
       	public static void main(String[] net){
	       	Scanner sc = new Scanner(System.in);					                   
	       	System.out.println("Enter a number 1 ");
								                       
	       	int a = sc.nextInt();
											                   
	    	System.out.println("Enter a number 2 ");
													                       
	       	int b = sc.nextInt();
																    
	       	System.out.println("Enter a number 3 ");
		int c = sc.nextInt();

		if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a +b*b){
			System.out.println("it is Pythagorean triplet");
		}
		else {
			System.out.println("its not pythagorean triplet");}
	}}
																		 
