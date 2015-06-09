import java.util.*;

public class Queue {
 
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
PriorityQueue<String> queue=new PriorityQueue<String>();
do{
System.out.println("Enter element in queue");
String elements=sc.next();

queue.add(elements);
System.out.println("Enter 1 to add another element");
 choice=sc.nextInt();
	}while(choice==1);

/*
queue.add("Vijay");
queue.add("Ramesh");
queue.add("AA");
*/
Iterator<String> itr=queue.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("");
queue.poll();
queue.poll();
Iterator<String> itr2=queue.iterator();
while(itr2.hasNext())
{
	System.out.println(itr2.next());
}
	}

}
