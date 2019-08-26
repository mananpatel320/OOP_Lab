class array{

 public static void main(String args[]){
  
  int arr[]; //declaration but memory not allocated
  arr = new int[10]; //memory allocated and size given
  //new allocates memory dynamically
  int arr1[] = new int[10]; //declaration and allocation
  //size of array never in LHS
  /*whenever array is uninitialized it contains the
    default value of data type.
    i.e 0 for int*/
  /*arr1[] = {1,2,3,4,5,6,7,8,9,0}; is error since it is allocated 
   using new*/ 
  int arr2[] = {1,2,3,4,5,6}; //array initialization
  int[] arr3, arr4; //only one time square brackets
  int arr5[],arr6[]; //two times square brackets
  }
}  
  
