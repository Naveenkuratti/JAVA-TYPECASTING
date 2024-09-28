package NonPrimitiveCasting;

public class MainClas2 {
	public static void main(String[] args) {
		Laptop l = new Computer();
		System.out.println(l.name);
		System.out.println("---------");
		Computer c = (Computer)l;
		System.out.println(c.cost);
	
	}
}
