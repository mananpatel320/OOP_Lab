class employee{
   int ID;
   String name;
   double salary;
   void initDetails(int id, String n, double s){
       //This function works as a constructor
       ID = id;
       name = n;
       salary = s;
   }
   employee(int ID, String name, double salary){
       //No return type for contructor
       //parameterised constructor
       //default constructor is parameterless constructor
       this.ID = ID;
       this.name = name;
       this.salary = salary;
   }
   void printDetails(){
       System.out.println("ID :"+ID);
       System.out.println("Name :"+name);
       System.out.println("Salary :"+salary);
   }
}

class example{
   public static void main(String args[]){
       employee e1 = new employee(1234,"Manan",20000000);
       employee e2 = new employee(1235,"Sanjay",200000);
       //e1.initDetails(1234,"Sanjay",20000);
       e1.printDetails();
       e2.printDetails();
   }
}   
