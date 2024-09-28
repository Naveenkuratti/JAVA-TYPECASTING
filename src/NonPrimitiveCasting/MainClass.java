package NonPrimitiveCasting;

public class MainClass {
public static void main(String[] args) {
	Father f = new Son();
	System.out.println(f.name);
System.out.println("-----");





Son s = (Son) f;
System.out.println(s.name+" "+s.age);
}
}
