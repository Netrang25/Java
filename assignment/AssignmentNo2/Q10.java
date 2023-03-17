class Reverse1{
	public static void main(String[] net){
		int n=3223;
		int i=n;

		int rem = 0;
		while(n!=0){
			int x = n%10;
			rem = rem*10+x;

			n=n/10;

		}
                if(rem==i){
		System.out.println(rem+ " it palindrom");}
		else{
			System.out.println(rem + "it not plindrom");}


	}}
                              
