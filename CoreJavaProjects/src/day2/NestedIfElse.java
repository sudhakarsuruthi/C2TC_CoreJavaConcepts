package day2;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=30, b=10, c=5;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}	}

}
