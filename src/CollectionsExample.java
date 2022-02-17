import java.util.ArrayList;
import java.util.Vector;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class CollectionsExample {
public static void main(String[] args) {
	//creating arraylist
	System.out.println("Array list creation");
	ArrayList<String> city=new ArrayList<String>();
	city.add("Bangalore");
	city.add("Delhi");
	System.out.println("Array list of cities "+city);
	
	//Vector creation
	System.out.println("__________________");
	System.out.println("Creating vector");
	Vector<Integer> vec=new Vector();
	vec.addElement(10);
	vec.addElement(20);
	System.out.println("Vector values "+vec);
	
	
	//creating hashset 
	System.out.println("************");
	System.out.println("Linked list creation");
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(100);
	set.add(200);
	set.add(300);
	System.out.println("Hash set "+set);
	
	//creating linked hash set
	System.out.println("**************");
	System.out.println("Linked hash set creation");
	LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();
	set1.add(101);
	set1.add(102);
	set1.add(103);
	set1.add(104);
	System.out.println("Linked hash set "+set1);
	
	
}
}
