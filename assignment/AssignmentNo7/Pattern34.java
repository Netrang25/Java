class Pattern34{
	public static void main(String[] Net){
		
		for(int i= 4;i>=1;i--){
			int n =1;
			for(int j =1;j<=i;j++){
				System.out.print( n++ + " " );
			}
			System.out.println();
			n=n++;
		}
	}}
