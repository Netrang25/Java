class Pattern8{
	public static void main(String[] net){
		for(int i = 1;i<=3;i++){
			int n = 1;
			char ch = 'A' ;
			for (int j = 1; j<=4;j++){
				if(j%2==1){
					System.out.print(ch++ + " " );
				}
				else
					System.out.print(n++ + " " );
			}
			System.out.println();


		}
	}
}
