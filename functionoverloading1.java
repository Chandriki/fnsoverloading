package chandriki2;

public class functionoverloading1 {
public static void main(String args[]) {
	Abcd o1=new Abcd();
	o1.test();
	o1.test(10);
	o1.test(10.5);
	
	
}
}
class Abcd
{
	void test()
	{
		System.out.println("without parameter");
	}
	void test(int a)
	{
		System.out.println("with int parameter");
	}
	void test(double d)
	{
		System.out.println("with double parameter");
	}
	
}