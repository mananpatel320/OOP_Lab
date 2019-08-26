class contlabel{
 public static void main(String args[]){
  int j;
  outer:for(int i=0;i<10;i++){
   inner:for( j=0;j<10;j++){
    if(j>i){
     System.out.println("*");
     continue outer;
     }
    }
    System.out.println(" "+(i*j));
  }
  
 }
}
