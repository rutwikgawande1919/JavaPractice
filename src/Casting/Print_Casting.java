package Casting;

public class Print_Casting {

	public static void main(String[] args) {
// implicit casting eg
		int a =123;
		double b =a;
		System.out.println(b);
		
		short q = 12345;
		long s =q;
		System.out.println(s);
		
//explicit casting eg
		
		long  g = 12345667789l;
		short h =(short) g;
		System.out.println(h);
		
		long r = 987654321l;
		int z =(int) r;
		System.out.println(z);
		
		float p = 67.34f;
		double v =(double) p;
		System.out.println(v);
	}

}
