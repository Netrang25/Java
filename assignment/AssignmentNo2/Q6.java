class Sum{
	public static void main(String[] net){
		int i = 0;
		int sum = 0;
		int multi = 1;
		while (i<=10){
			if(i%2==0){
				sum=sum+i;
			}
			else{
				multi=multi*i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(multi);
	}}
