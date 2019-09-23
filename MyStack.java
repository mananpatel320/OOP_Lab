class Stack{
	private int tos, size;
	private int stck[];
	Stack(){
		stck = new int[10];
		size = 10;
		tos = -1;
	}
	Stack(int a){
		stck = new int[a];
		size = a;
		tos = -1;
	}
	void push(int item){
		if(tos == (size - 1)){
			System.out.println("STACK IS FULL");
		}
		else{
			++tos;
			stck[tos] = item;
			System.out.println(item+" added to stack successfully");
		}
	}
	int pop(){
		if(tos == -1){
			System.out.println("STACK IS EMPTY");
			return -999;
		}
		else
			return stck[tos--];
	}
	void print(){
		if(tos == -1){
			System.out.println("STACK IS EMPTY");
		}
		else{
			for(int i=0;i<=tos;i++){
				System.out.println(stck[i]);
			}
		}
	}
}

class MyStack{
	public static void main(String[] args){
		Stack s1 = new Stack(Integer.parseInt(args[0]));
		Stack s2 = new Stack();
		s1.push(30);
		s1.push(20);
		s2.push(10);
		s2.push(20);
		s2.pop();
		s2.pop();
		s2.pop();
		s1.print();
		s2.print();
	}
}
	
