class Pattern28{
	public static void main(String[] net){
		char ch = 'J';
		for(int i =1;i<=4;i++){
			for(int j =1;j<=i;j++){
				System.out.print(ch + " " );
				ch--;
			}
			System.out.println();
		}
	}
}

