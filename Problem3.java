abstract class Worker{
	private int ID;
	Worker(){
		ID = -1;
	}
	Worker(int ID){
		this.ID = ID;
	}
	Worker(Worker w){
		ID = w.ID;
	}
	abstract double computeWages();
}

class MonthlyWorker extends Worker{
	private int numOfDays;
	MonthlyWorker(){
		super();
		numOfDays = -1;
	}
	MonthlyWorker(int numOfDays, int ID){
		super(ID);
		this.numOfDays = numOfDays;
	}
	MonthlyWorker(MonthlyWorker mw){
		super(mw);
		numOfDays = mw.numOfDays;
	}
	double computeWages(){
		return 200*numOfDays;
	}
}

class DailyWorker extends Worker{
	private int numOfHours;
	DailyWorker(){
		super();
		numOfHours = -1;
	}
	DailyWorker(int numOfHours, int ID){
		super(ID);
		this.numOfHours = numOfHours;
	}
	DailyWorker(DailyWorker dw){
		super(dw);
		numOfHours = dw.numOfHours;
	}
	double computeWages(){
		return 20*numOfHours;
	}
}

class Problem3{
	public static void main(String[] args){
		MonthlyWorker r = new MonthlyWorker();
		MonthlyWorker r1 = new MonthlyWorker(23,123);
		DailyWorker s = new DailyWorker();
		System.out.println(r1.computeWages());
		System.out.println(r.computeWages());
	}
}

