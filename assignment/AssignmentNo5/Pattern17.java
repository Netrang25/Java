class Pattern18{
	public static void main(String[] net){
		char ch = 'A';
		char H = 'a';
		for(int i = 1;i<=4;i++){
			for(int j =1 ;j<=4;j++){
				if(j%2==0){
					System.out.print(H + "  ");
				}
				else{
					System.out.print(ch + " " );
				}
				ch++;
				H++;
			}
			System.out.println();
		}
	}
}
