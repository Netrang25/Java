import java.util.Scanner;
class Cost{
	public static void main (String[] net){
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter selling price");
		double x = sc.nextDouble();
		System.out.println("Enter Cost price");
		double y = sc.nextDouble();
		if(x>y){
			System.out.println("profit of  " + (x-y));}
		else if (x==y){
			System.out.println("Nor profit neither loss");

		}
		else{
			System.out.println("loss of  " +(y-x));}}}


