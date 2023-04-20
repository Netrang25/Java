
import java.io.*;

class Array2{
	public static void main(String[] Net) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of array");
		int size =Integer.parseInt(br.readLine());

		int arr[] = new  int[size];
		System.out.println("Enter your Element");
		for(int i =0 ;i<arr.length;i++){
			 
		  arr[i] =Integer.parseInt(br.readLine());
		}
		int pro = 1;
		for(int i =0;i<arr.length;i++){
		if(arr[i]%2==0){
			pro = pro * arr[i];
		}
		}
	
	
		System.out.println("Even Element Product is : "+pro );
		
	}
}




