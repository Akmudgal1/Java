package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> hs= new HashSet<>();
hs.add("Apple");
hs.add("banana");
hs.add("Papaya");
hs.add("mango");
hs.add("Potato");
hs.add("onion");
System.out.println("size of the hashset is "+hs.size());
hs.remove("mango");
hs.remove("orange");
if(hs.contains("Papaya")) {
	hs.remove("Papaya");
}
else {
	System.out.println("unrecognised item");
}
for(String s:hs) {
	System.out.println(s);
}
	}

}
