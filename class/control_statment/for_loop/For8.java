class For8{
	public static void main(String[] net){
		int n =23;
		int sum=0;
		while(n!=0){
			int x=n%10;
			sum=sum+x*x*x;
			n=n/10;
		}
		if (sum==n){
			System.out.println("It's amtrong no");}
		else {
			System.out.println( "not amstrong");
		}}}
