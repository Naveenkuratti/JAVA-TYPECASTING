package Working;



public class Solution {
  static void display(Table obj) {
	if (obj instanceof Pen) {
	
		System.out.println("downing pen");
		Pen p =(Pen)obj;
		System.out.println(p.x+" "+p.y);
	}
	else if(obj instanceof Book) {
		System.out.println("dowing book");
		Book b =(Book)obj;
		System.out.println(b.x+" "+b.z);
		
	}

			  
  }
  public static void main(String[] args) {
	display(new Pen());
	
	System.out.println("-----------");
	
		display(new Book());
		System.out.println("---------");
	}
}

