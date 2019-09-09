//read() can take only one char as input and stores the unicode value of the char
import java.io.*;
class InputUser{
	public static void main(String[] args)throws IOException{
		int x = System.in.read();
		System.out.println("The unicode value of the character is:"+x);
		System.out.println("The character is:"+(char)x);
	}
}
