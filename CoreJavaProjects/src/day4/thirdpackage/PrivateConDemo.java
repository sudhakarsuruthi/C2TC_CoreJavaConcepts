package day4.thirdpackage;

public class PrivateConDemo {
	public static void main(String s[]) {
		
		
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}


