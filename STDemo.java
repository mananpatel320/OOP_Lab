import java.util.*;
class STDemo{
	static String in = "title=Java: The Complete Reference;author==Schidt;publisher=McGraw-Hill;;;;copyright=2014";
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer(in, "=;");
		while(st.hasMoreTokens()){
			String key = st.nextToken();
			System.out.println(key);
		}
		StringTokenizer st1 = new StringTokenizer(in, ";",true);
		while(st1.hasMoreTokens()){
			String key = st1.nextToken();
			System.out.println(key);
		}
	}
}
