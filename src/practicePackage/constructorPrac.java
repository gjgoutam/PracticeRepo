package practicePackage;

public class constructorPrac {

	int a;
	String b;
	long c;
	
	constructorPrac(){
		
		System.out.println("From default constructor");
		a=01;
		b="Sharmita";
		c=9902577325L;
	}
	
	public constructorPrac(int a, String b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	constructorPrac(String b){
		
		System.out.println("From String parameter constructor");
		this.b=b;
	}
	
	public static void constructorPrac() {   /// method with same name as class name, if return type is added to constructor, then it becomes a method. 
		
		System.out.println("MEthod/Funtion with same name as class");
	}
	
	
	public static void main (String [] args) {
		
		constructorPrac obj = new constructorPrac();
		System.out.println(obj.a +" "+obj.b+" "+obj.c);
		constructorPrac obj2 = new constructorPrac("Goutam");
		System.out.println(obj2.b);
		
		constructorPrac obj3 = new constructorPrac(03,"Ganapati",9448662456L);
		System.out.println(obj3.a +" "+obj3.b+" "+obj3.c);
		constructorPrac.constructorPrac(); // as it is static, should not be called at obj level, called from class
		
	}
}
