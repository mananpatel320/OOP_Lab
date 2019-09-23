package MyPackage;
import java.util.Random;
class genRandom{
	Random r = new Random();
	int [] generate(){
		int a[] = new int[10];
		for(int i=0;i<10;i++){
			a[i] = Math.abs(r.nextInt());
		}
		return a;
	}
}
class randomDemo{
	public static void main(String args[]){
		genRandom g = new genRandom();
		int x[] = new int[10];
		x = g.generate();
		System.out.println("The random numbers are");
		for(int i=0;i<10;i++)
			System.out.println(x[i]);
	}
}
