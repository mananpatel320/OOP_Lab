import java.util.*;
class HTDemo{
	public static void main(String args[]){
		Hashtable<String,Double> balance = new Hashtable<String,Double>();
		Enumeration<String> names;
		String str;
		double bal;
		balance.put("John", 3434.34);
		balance.put("Tom",123.22);
		balance.put("Jane",1378.33);
		balance.put("Todd",99.22);
		balance.put("Ralph",-19.56);
		//Show all balances in hashtable
		names = balance.keys(); //returns an enumeration of the keys contained in the hashtable
		while(names.hasMoreElements()){ //hasMoreElements() method of Enumeration used to test if this enumneration contains more elements or not
		str = names.nextElement(); // reutrn the next elemnts 
		System.out.print(str.hashCode() + " "); //returns integer hash code value of object
		System.out.println(str + ": " + balance.get(str)); // return the value mapped by a particular key mentioned in the parameter
		}
		//deposit 1000 into John's a/c
		bal = balance.get("John");
		balance.put("John",bal+1000); // insert a mapping into a table
		System.out.println("John's new balance: " + balance.get("John"));
	}
}
