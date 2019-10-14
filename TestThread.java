class PrintDemo{
	void printCount(){
		for(int i=5 ;i>0 ;i--){	
			System.out.println("Counter --- " + i);
		}
	}
}

class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo PD;
	ThreadDemo(String name, PrintDemo pd){
		threadName = name;
		PD = pd;
		System.out.println("Starting " + threadName);
		start();
	}
	public void run(){
		synchronized(PD){
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
}

class TestThread{
	public static void main(String[] args){
		PrintDemo PD = new PrintDemo();
		ThreadDemo T1 = new ThreadDemo( "Thread - 1", PD);
		ThreadDemo T2 = new ThreadDemo( "Thread - 2", PD);
		try {
			T1.join();
			T2.join();
		} catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
}

