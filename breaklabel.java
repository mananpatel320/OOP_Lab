class breaklabel{
 public static void main(String args[]){
  first:for(int i=0;i<10;i++){
   second:for(int j=0;j<20;j++){
   System.out.print("("+i+","+j+")");
    if(j>i)
     break first;
    }
   }
  System.out.print("\n");
  first:for(int i=0;i<10;i++){
  System.out.print(i);
  }
  System.out.print("\n");
  for(int k=0;k<5;k++){
   if(k%2==0)
   // break first; is ERROR
   break;
   System.out.print(k);
  }
  
 }
}
