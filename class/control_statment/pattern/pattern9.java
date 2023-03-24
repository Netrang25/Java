class Pattern9{
	public static void main(String[] net){
		int m = 1;
		char ch = 'A';
		for(int i = 1;i<=3;i++){
			for(int j = 1;j<=4;j++){
				if (j%2==1){
					System.out.print(" " + ch++);
				}
				else {
					System.out.print(" " + m++);
				}
			}
			System.out.println();
		}
	}
}

