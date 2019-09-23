class Factorial{
	public static void main(String[] args){
		System.out.println(fact(0));
	}
	static int fact(int num){
		if(num == 0 || num == 1)
			return 1;
		else
			return num*fact(num-1);
	}
}
