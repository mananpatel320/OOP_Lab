class large{
 
  public static void main(String args[]){
   
    int arr[] = {8,45,-90,78,45,02,56,10,-67,-12};
    int max, min;
    max=arr[0];
    min=arr[0];
    for(int i=0;i<10;i++){
     if(arr[i]>max)
      max=arr[i];
     if(arr[i]<min)
      min=arr[i];
     }
     System.out.println("The max value is "+max);
     System.out.println("The min value is "+min);
   }
   
}
