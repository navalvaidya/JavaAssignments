import java.util.*;


public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> m1=new HashMap<String, Integer>();
m1.put("a", 1);
m1.put("b", 2);
m1.put("c", 3);
//System.out.println(m1.values());
//System.out.println(m1.remove("b"));
System.out.println(m1);

Map<String, Integer> m2=new LinkedHashMap<String, Integer>();
m2.put("is", 1);
m2.put("if", 2);
m2.put("it", 3);

System.out.println(m2);
int b=m2.get("if");
m2.put("if", b*2);
System.out.println("multiplying if value by 2");
System.out.print(m2);

	}

}
