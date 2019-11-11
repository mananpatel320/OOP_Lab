import java.io.*;
class BufferedReaderTest{
	public static void main(String args[]) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine(); //line buffered
		System.out.println(s);
	}
}                                    
