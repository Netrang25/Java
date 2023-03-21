class Var1{
	public static void main(String[] net){
		int x = 10;
		int y = 20;
		{
			System.out.println(x + " " + y);
		}
		{
			x = 15;
			System.out.println(x + " " + y);
		}
		System.out.println(x + " " +y);
	}
}
