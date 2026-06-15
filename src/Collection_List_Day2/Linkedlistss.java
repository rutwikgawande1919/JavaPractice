package Collection_List_Day2;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistss {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();

		l.add(13);
		l.add(15);
		l.add(18);
		l.add(25);

		System.out.println(l);
		System.out.println("===============");

		Integer a = l.get(1);
		System.out.println(a);
		System.out.println("================");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("================");
		for (Integer b : l) {
			System.out.println(b);
		}
	}
}
