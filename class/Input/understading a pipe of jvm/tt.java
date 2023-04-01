import java.io.*;
class Input{
	public static void main(String[] net)throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("name");
		String name=br.readLine();
		
		br.close();

		System.out.println("no");
		int no=Integer.parseInt(br1.readLine());

		System.out.println(name);
		System.out.println(no);
	}
}
