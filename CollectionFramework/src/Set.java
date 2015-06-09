import java.util.*;
public class Set {

	public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<Integer>();	
	int count[]={21,33,43,4,45};
for(int i=0;i<5;i++)
{
	set.add(count[i]);
	
}
System.out.println(set);

TreeSet<Integer> treeset = new TreeSet<Integer>(set); 
System.out.println("sorted set "+treeset);
	}

}
