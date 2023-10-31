package Task_12;
import java.util.ArrayList;
import java.util.List;
public class Question_4 {
public static void main(String[] args) {
	List name = new ArrayList();
	name.add("apple");
	name.add("mango");
	name.add("papaya");
	name.add("guva");
	name.add("orange");
	
	System.out.println(name);
	String[] arr = new String[name.size()];
	name.toArray(arr);
	System.out.println("array: ");
	for(String a:arr) {
		System.out.println(a);
	}
	
}
}
