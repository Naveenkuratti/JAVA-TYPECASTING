package Working;

public class MainClass {
static  void selectState(India obj) {
	if(obj instanceof Karnataka) {
		System.out.println("state--->karnataka");
		Karnataka k = (Karnataka)obj;
		System.out.println("pm:"+k.pm+"cm:"+k.cm);
		
	}
	else if(obj instanceof TamliNadu) {
		System.out.println("state--->TamliNadu");
		 TamliNadu T = (TamliNadu)obj;
		System.out.println("pm:"+T.pm+"cm:"+T.cm);
	
}
	else if(obj instanceof Goa) {
		System.out.println("state--->Goa");
		Goa G = (Goa)obj;
		System.out.println("pm:"+G.pm+"cm:"+G.cm);
}
}
public static void main(String[] args) {
	 selectState(new Karnataka());
	System.out.println("---------");
	 selectState(new  TamliNadu());
	System.out.println("----------");
	 selectState(new Goa());
	System.out.println("-------");
}
}