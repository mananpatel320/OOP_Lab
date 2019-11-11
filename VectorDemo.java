import java.util.*;
class VectorDemo{
	public static void main(String args[]){
		Vector<Integer> v = new Vector<Integer>(3,1);
		System.out.println("Initial size: " + v.size());
		System.out.println("1) Initial capacity: " + v.capacity());
		v.addElement(3);
		v.addElement(1);
		v.addElement(4);
		v.addElement(5);
		System.out.println("2) Capacity after additions: " + v.capacity());
		v.addElement(9);
		System.out.println("3) current capacity: " + v.capacity());
		System.out.println("First Element: " + v.firstElement());
		System.out.println("Last Element: " + v.lastElement());
		if(v.contains(3)){
			System.out.println("Vector contains 3");
		}
		Iterator<Integer> vItr = v.iterator();
		System.out.println("Elements in vector: ");
		while(vItr.hasNext()){
			System.out.print(vItr.next() + " ");
		}
	}
}
