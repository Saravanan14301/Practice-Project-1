import java.util.Hashtable;
import java.util.Map.Entry;
public class Map {
	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Entry<Integer,String> m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
		}  