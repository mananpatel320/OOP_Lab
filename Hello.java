class Hello{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8};
		for(int i = 0;i <arr.length; i++)
			System.out.println(arr[i]);
		String s = "Good Morning";
		System.out.println(s.length());//int length
		//strings are not treated as character arrays in java
		System.out.println(s.charAt(3));//char charAt(int index)
		System.out.println(s.equals("good Morning"));//boolean s.equals(String s)
		
	}
}

