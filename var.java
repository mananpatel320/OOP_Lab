class var{
 
 public static void main(String args[]){
 
  int a=10, b=25;
  System.out.println(a);
  System.out.println("Value:b="+b);
  System.out.println("Sum="+a+b);
  System.out.println("Sum="+(a+b));
  double x=10.5;
  float y=17.7f;
  //float y=17.7 is error
  byte t=-128;
  char c='c';
  System.out.println(x+a);
  byte k=(byte)(x+t+y);
  System.out.println(k);
  boolean m=true;
  System.out.println(m);
  int bin=0b0110;
  System.out.println(bin);
  int oct=066;
  System.out.println(oct);
  //int oct1=099; is error
  int hex=0x9b;
  System.out.println(hex);
  String str="Hello";
  System.out.println(str);
  int bin1=0b0110_1100_1011_0111;
  System.out.println(bin1);
 }
}
