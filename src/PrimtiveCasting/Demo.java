package PrimtiveCasting;


public class Demo {
 public static void main(String[] args) {
	
	 int a=35;
	 double b=a;
	 System.out.println(a);//35 35.0
	 
	 
	 double c=53;
	 System.out.println(c);//53.0
	 
	 
	 char d='A';
	 int e=d;
	 System.out.println(d+" "+e);
	 
	 System.out.println("============================");
	 //Narrowing
	 double x=12.67;
	 int h=(int) x;
	 System.out.println(x+" "+h);
	 
	 int z=(int)123.98;
	 System.out.println(z);
	
	 
	 int i=68;
	 char j=(char)i;
	 System.out.println(i+" "+j);
	 System.out.println("=======================");

 
 
 System.out.println((char)98);//b
 System.out.println((int)78.21);//78
 System.out.println("A"+"B");//AB
 System.out.println("A"+10);//A10
 System.out.println("A"+10+20);//A1020
 System.out.println(10+20+"A");//30A
 System.out.println("A"+"B");//AB
 System.out.println('a'+20);//117
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
}
