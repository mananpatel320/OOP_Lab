class Parse{
	public static void main(String[] args){
		int len;
		len = args.length;
		for(int i = 0;i < len;i++){
			System.out.println(Integer.parseInt(args[i]) + 10);
		}
		//Float.parseFloat();
		//Double.parseDouble();
	}
}
