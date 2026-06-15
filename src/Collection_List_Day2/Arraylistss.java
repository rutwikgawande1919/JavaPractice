package Collection_List_Day2;

import java.util.ArrayList;
import java.util.List;

public class Arraylistss {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("Rutwik");
		l.add("Ravindra");
		l.add("Gawande");

		String s = l.get(0);
		System.out.println(s);
		System.out.println("====================");

		System.out.println(l);
		System.out.println("====================");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(" for loop :" + l.get(i));
		}
		System.out.println("====================");
		for (String a : l) {

		}
		System.out.println(" for each loop :" + l);
	}
}
