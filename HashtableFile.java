import java.io.*;
import java.util.*;
class HashtableFile{
	public static void main(String args[]){
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		try{
			FileReader fr = new FileReader("Hashtable.txt");
			BufferedReader br = new BufferedReader(fr);
			int s;
			String numbers = "", names = "";
			while ( (s = br.read()) != -1 ){
				if( (char)s >= '0' && (char)s <='9' ){
					numbers += (char)s;
				}
				else if(( (char)s >= 'A' && (char)s <= 'Z' ) || ( (char)s >= 'a' && (char)s <= 'z' )){
					names += (char)s;
				}
				else if( s == 10 ){
					ht.put(Integer.parseInt(numbers),names);
					names = "";
					numbers = "";
				}
			}
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(ht.toString());
	}
}
