abstract class Student{ //we cannot create the object of such class since it has at least one abstract 
	int ID;
	Student(int ID){
		this.ID = ID;
	}
	//method without body
	abstract void calcAvgMarks();
}

class UGstudent extends Student{
	double thCourse1, thCourse2, thCourse3, thCourse4;
	UGstudent(double thCourse1, double thCourse2, double thCourse3, double thCourse4, int ID){
		//this.ID = ID; redundant code
		//super should always be the first statement in the sub class constructor 
		//if super not called in the first line then super(); is called by default and since there's no default parameterless constructor in the super class there will be compilation ERROR 
		super(ID); //will call immediate super class constructor
		this.thCourse1 = thCourse1;
		this.thCourse2 = thCourse2;
		this.thCourse3 = thCourse3;
		this.thCourse4 = thCourse4;
	} 
	void calcAvgMarks(){ //method overriding
		//we cannot invoke an abstract method
		//super.calcAvgMarks(); //other use of super keyword
		double avg;
		avg = (thCourse1 + thCourse2 + thCourse3 + thCourse4) / 4;
		System.out.println(avg);
	}	                              
}

class PGstudent extends Student{
	double thCourse1, thCourse2, rsCourse1;
	PGstudent(double thCourse1, double thCourse2, double rsCourse1, int ID){
		super(ID);
		this.thCourse1 = thCourse1;
		this.thCourse2 = thCourse2;
		this.rsCourse1 = rsCourse1;
	}
	void calcAvgMarks(){
		double avg;
	    avg = (thCourse1 + thCourse2 + (2*rsCourse1)) / 3;
	    System.out.println(avg);
	}
}

class Inher{
	public static void main(String[] args){
		//Student s1 = new Student(1234);
		UGstudent s2 = new UGstudent(78.5,99.5,67,79.5,1234);
		//s1.calcAvgMarks();
		s2.calcAvgMarks();
		/*s1 = s2; 
		s1.calcAvgMarks(); //Dynamic Method Dispatch*/
		//s2 = s1; ERROR not possible
	}
}
