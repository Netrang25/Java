import java.util.Scanner;
class Max12{
	    public static void main(String[] net){
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a number 1 ");
		    int x = sc.nextInt();
		    System.out.println("Enter a number 2 ");
		    int y = sc.nextInt();
		 System.out.println("Enter a number 3 ");
                                                                         int z = sc.nextInt();	
									if(x>y && x>z ){
									       System.out.println(x+ "  is greater than " + y + z );
									}
								       	else if(y>x && y>z){
										System.out.println(y + "  is greater than" + x + z);}
									else if (z>x && z>y ){
									         System.out.println(z + "  is greater than" + y + x);}
								      else if (x==y && x>z && y>z){
								                     System.out.println(x +  " & " + y + " are equal and greater than "	+ z);}
									else if (y==z  && y>x & z>x){
										System.out.println(y + " & " + z + "  are equal and greater than " + x);}
									else if (x==z && x>y && z>y)
										
									{	System.out.println(x + " & " + z + "  are equal and greater than " + y);}
									else{
										System.out.println(x +  " , " + y + " &  " +z +" all are equal");} 
									}}


