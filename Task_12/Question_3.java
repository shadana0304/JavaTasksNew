package Task_12;
import java.util.Map;
import java.util.TreeMap;
public class Question_3 {
public static void main(String[] args) {
	TreeMap<Integer,String> tm = new TreeMap<>();
	
	tm.put(101, "Nathiya");
	tm.put(102, "Bavyaa");
	tm.put(103, "Archana");
	tm.put(104, "Yaalini");
	tm.put(105, "Saranya");
	tm.put(106, "Priya");
	
	
	
	System.out.println("Employee names in alphabetical order");
	//System.out.println(tm);
	for(String name:tm.values()) {
		System.out.println(name);
	}
	
	
	
}
}
