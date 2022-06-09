package co.infosys.java8;

@FunctionalInterface
interface Calci {

	public int add(int a, int b);

	public default void m1() {
		System.out.println("am from calci interface default m1 method");
	}

	public static void m2() {
		System.out.println("am from calci interface static m2 method");
	}
}

public class Test {
	public static void main(String[] args) {
		Calci cal = (a, b) -> a + b;
		System.out.println(cal.add(12, 13));
		cal.m1();
		Calci.m2();
	}
}
