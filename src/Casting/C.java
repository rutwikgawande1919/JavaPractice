package Casting;

public class C {
	public static void main(String[] args) {
		int a = 16;
		long l = a;
		System.out.println(l);

		short s = 23;
		long n = s;
		System.out.println(n);

		byte v = 33;
		float c = v;
		System.out.println(c);

		long num = 9846651137l;
		int k = (int) num;
		System.out.println(k);

		double d=55.78;
		short e=(short) d;
		System.out.println(e);
		
	}
}
