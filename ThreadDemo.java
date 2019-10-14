class ThreadB extends Thread{
	long total;
	public void run(){
		synchronized(this){
			for(long i=0;i<100;i++){
				total += i;
				System.out.print(total + " ");
			}
			notify(); //main wakes up
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b){
			try{
				System.out.println("Waiting for b to complete...");
				b.wait(); //can't write simply since wait() is a non-static method
				//main waits since wait has been called inside main
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Total is: "+ b.total);
		}
	}
}
				
