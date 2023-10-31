package Task_12;
import java.util.ArrayList;
import java.util.List;
public class Question_2 {
public static void main(String[] args) {
	
	ArrayList<String> name = new ArrayList<>();
	name.add("saranya");
	name.add("shadana");
	name.add("priya");
	name.add("maitra");
	name.add("kanika");
	
	System.out.println("ArrayList before removing elements:"+name);
	name.clear();;
	
	System.out.println("ArrayList after removing elements:"+name);
	
}
}
