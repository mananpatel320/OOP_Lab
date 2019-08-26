//constructor overloading
class employee{
   int ID;
   String name;
   double salary;
   employee(int ID, String name, double salary){
       //No return type for constructor
       //parameterized constructor
       //default constructor is parameterless constructor
       this.ID = ID;
       this.name = name;
       this.salary = salary;
   }
   employee(){
       ID = -1;
       name = " ";
       salary = 0.0;
   }
   employee(int ID, String name){
       this.ID = ID;
       this.name = name;
       salary = 100;
   }
   void printDetails(){
       System.out.println("ID :"+ID);
       System.out.println("Name :"+name);
       System.out.println("Salary :"+salary);
   }
}
//when we start providing our own constructors in program then the default constructor won't be provided by the J.V.M.
class example1{
   public static void main(String args[]){
       employee e1 = new employee(1234,"Manan",20000000);
       employee e2 = new employee(1235,"Sanjay");
       employee e3 = new employee();
       e1.printDetails();
       e2.printDetails();
       e3.printDetails();
   }
}   
