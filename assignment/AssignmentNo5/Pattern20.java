class Pattern20{
	public static void main(String[] net){
		for(int i =1;i<=6;i++){
			int Fj= 'F';
			int p = 6;
			for(int j =1;j<=6;j++){
				if(j%2==0){
					System.out.print(p    );
					System.out.print( "  " );
				}
				else
				{
					System.out.print ( (char)Fj);
					System.out.print(" " );

				}
				Fj--;
				p--;
			}
			System.out.println();
		}
	}
}
