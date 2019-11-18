import java.io.*;
public class fileCount{
	public static void main(String args[]){
		int ctr = 0;
		try{
			FileReader fr = new FileReader("temp.txt");
			BufferedReader br = new BufferedReader(fr);
			int s;
			String str = "";
			while(( s = br.read()) != -1 ){
				if(((char)s >= 'a' && (char)s <= 'z')||((char)s >='A' && (char)s <='Z')){
					str += (char)s;
				}
				else{
					if(str.equals(args[0])){
						++ctr;
					}
					str = "";
				}
			}
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(ctr);
	}
}
