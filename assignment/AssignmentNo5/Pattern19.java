class Pattern19{
	public static void main(String[] net){
		int n= 1;
		for(int i =1;i<=3;i++){
			int p = 3;
			char H  = 'C';
			for(int j =1;j<=3;j++){
				System.out.print(n*n   );
				System.out.print(H  );
				System.out.print(p + " " );
				n++;
				H--;
				p--;
			}
			System.out.println();
		}
	}
}
