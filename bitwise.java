class bitwise{
 public static void main(String args[]){
  System.out.println(8>>2); //right shift
  System.out.println(-8>>2); //right shift
  System.out.println(8<<2); //left shift 
  System.out.println(-8<<2); //left shift
  System.out.println(8>>>2); //unsigned right shift
  System.out.println(-8>>>2); //unsigned right shift
  System.out.println((byte)(-8>>>2)); //unsigned right shift with type casting  
  }
}
