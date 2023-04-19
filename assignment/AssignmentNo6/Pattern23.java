class Pattern23{
	public static void main(String[] net){
		int n = 10;
		for(int i =1;i<=4;i++){
			for (int j =1;j<=i;j++){
				System.out.print(n-- + " " );
			}
			System.out.println();
		}
	}
}
