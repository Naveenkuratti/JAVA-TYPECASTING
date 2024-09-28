package NonPrimitiveCasting;

public class MainClass1 {
public static void main(String[] args) {
	Book b =new Pen();
	System.out.println(b.name);
	
	System.out.println("----------------------------------");
	
	
	Pen p =(Pen) b;
	System.out.println(p.name+" "+p.cost );
	
}
}
