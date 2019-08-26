class pattern{
 
  public static void main(String args[]){
   
    int arr[][] = new int[4][];
    int k=1;
    for(int i=0;i<4;i++){
     arr[i] = new int[4-i];
     for(int j=0;j<(4-i);j++)
      arr[i][j] = k++;
    }  
    for(int i=0;i<4;i++){
     for(int j=0;j<(4-i);j++){
      System.out.print(arr[i][j]+" ");
     }
     System.out.print("\n");
    }
  }
}
