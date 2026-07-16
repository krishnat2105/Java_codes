class A{
	int x;
	String y;
	void m(){
		System.out.println(x+y);
		}
}
public class ClassObjectEx1 {
    public static void main(String [] args) {
    	A a=new A();
    	a.x = 10;
    	a.m();
    	A b = new A();
    	b.y = "Ram";
    	//System.out.println(a.x);
    	//System.out.println(b.x);
    	b.m();    	
    }
}
