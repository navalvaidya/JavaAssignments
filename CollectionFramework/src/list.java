import java.util.*;


public class list {

	public static void main(String[] args) {
List<String> al=new ArrayList<String>();
al.add("b");
al.add("c");
al.add("a");
al.add("d");
System.out.println("Implementing ArrayList: "+al);
List<String> ll=new LinkedList<String>();
ll.add("b");
ll.add("c");
ll.add("a");
ll.add("d");
System.out.println("Implementing LinkedList: "+ll);
List<String> al1=new ArrayList<String>();
al1.add("e");
al1.add("f");
al1.add("g");
al1.add("h");
System.out.println("Another Arraylist: "+al1);
al.addAll(2,al1);//addAll(index,collection)
ll.addAll(al);
System.out.println("combining 2 ArrayList: "+al);

System.out.println("combining linkedlist to ArrayList: "+ll);
List<Integer> al2=new ArrayList<Integer>();
al2.add(33);
al2.add(25);
al2.add(12);
al2.add(45);
al2.add(44);
System.out.println("Integer array list: "+al2);


	}

}
