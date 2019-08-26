class Test{
	int x, y;
	Test(int x, int y){
		this.x = x;
		this.y = y;
    }
    
    int add(){
    	return x+y;
    }
    
    int add(int z){
    	return x+y+z;
    }
    
    /*double add(int z){
    	return x+y+z;
    }
    ERROR!!*/
    
    double add(double z){
    	return x+y+z;
    }
    
    int add(int w, int z){
    	return x+w+y+z;
    }
}

class AddClass{
	public static void main(String args[]){
		Test t = new Test(4, 5);
		System.out.println(t.add());
		System.out.println(t.add(6));
		System.out.println(t.add(6.0));
		System.out.println(t.add(6,7));
	}
} 
