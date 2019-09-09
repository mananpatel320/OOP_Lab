//whatever methods we used are the part of Scanner class which belongs to the util package
//System.in is associated with the standard input device which is keyboard
import java.util.*;
class InputUser1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = sc.nextInt();
		long b = sc.nextLong();
		double c = sc.nextDouble();
		float d = sc.nextFloat();
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
		
