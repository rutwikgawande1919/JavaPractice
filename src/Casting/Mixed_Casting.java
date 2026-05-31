package Casting;

public class Mixed_Casting {
	public static void main(String[] args) {

//implicit casting		
		int a = 10;
		long b = a;
		System.out.println(b);
//implicit casting		
		float c=48.34f;
		double d=c;
		System.out.println(d);
//explicit casting		
		double e=73.28;
		int f=(int) e;
		System.out.println(f);
//explicit casting			
		float g = 45.65f;
		short h=(short) g;
		System.out.println(h);
	}
}
