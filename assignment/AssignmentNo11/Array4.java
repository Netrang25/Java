


import java.io.*;

class Array4{
	public static void main(String[] Net) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of array");
		int size =Integer.parseInt(br.readLine());

		char arr[] = new  char[size];
		System.out.println("Enter your Element");
		for(int i =0 ;i<arr.length;i++){
			 
		  arr[i] =(char)(br.read());
		}
		for(int i =0;i<arr.length;i++){
			if(arr[i] == a|| arr[i] == e || arr[i] == i || arr[i] == o || arr[i]==u){
				System.out.Println(arr[i]);
			}
		}
	
	
		
		
	}
}




