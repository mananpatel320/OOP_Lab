class foreach{

 public static void main(String args[]){
  int[][] arr2,arr3,arr4;
  int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
  for(int x:arr)
   System.out.print(x+" ");
  //no need to figure out the size of the array
  //no element skipped 
  //no reverse traversal
  /* int x;
     for(x:arr) 
     is ERROR
  */
  //no element value can be modified using x
  //x is also called a read only variable
  System.out.print("\n");
  int arr1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
  for(int x[]:arr1){
   for(int y:x){
    System.out.print(y+" ");
   }
  }
  System.out.print("\n");
  String str[] = {"apple","banana","grapes"};
  for(String x:str){
   System.out.println(x);
  }
 
 }
}
