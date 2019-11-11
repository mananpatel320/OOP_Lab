import java.util.*;
class ArrayListDemo{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al : " + al.size());
		al.add("Manan");
		al.add("Joey");
		al.add("Chandler");
		al.add("Monica");
		al.add("Ross");
		al.add(1,"Phoebe");
		System.out.println("Size of al after additions : " + al.size());
		System.out.println("Contents of al : " + al);
		al.remove("Chandler");
		al.remove("Ross");
		al.remove(2);
		System.out.println("Size of al after deletions : " + al.size());
		System.out.println("Contents of al :" + al);
		String str[] = new String[al.size()];
		str = al.toArray(str);
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}
}
