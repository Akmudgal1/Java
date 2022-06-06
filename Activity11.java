package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> map= new HashMap<>();
map.put(1, "Green");
map.put(2, "red");
map.put(3, "yellow");
map.put(4, "pink");
map.put(5, "purple");
System.out.println("the original map is "+map);
map.remove(2);
if(map.containsValue("Green")) {
	System.out.println("green color is present");
	
}
else {
	System.out.println("green color is not present");
}
System.out.println("size of the map is "+ map.size());
	}

}
