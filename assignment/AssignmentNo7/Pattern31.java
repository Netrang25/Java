class Pattern31{
	public static void main(String[] Net){
		String ste = "C2W";
		int n = 10;
		for (int i =1;i<=4;i++){
			for  ( int j =1;j<=i;j++){
				System.out.print(ste + (n--) + " " );
			}
			System.out.println();
		}
	}
}

