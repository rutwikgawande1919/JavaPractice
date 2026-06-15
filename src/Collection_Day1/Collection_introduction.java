package Collection_Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection_introduction {
public static void main(String[] args) {
	
	List l = new ArrayList<>();
	l.add(35);
	l.add("Rutwik");
	l.add(false);
	System.out.println(l);
	
	
	Set s = new HashSet();
	s.add("monday");
	s.add("Tuesday");
	s.add("Wednesday");
	s.add("Thursday");
	System.out.println(s);
	
	
	Map<String, Integer> m = new HashMap();
	m.put("Rutwik", 79);
	m.put("Sada", 89);
	m.put("Ankush", 91);
	m.put("Shrutika", 95);
	System.out.println(m);
}
}
