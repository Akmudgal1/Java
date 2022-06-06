package Activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> list= new ArrayList<>();
System.out.println("all elements  of the list are");
list.add("Akanksha");
list.add("Prabhjot");
list.add("Shreya");
list.add("Vipul");
list.add("Urvashi");
for(int i=0;i<=list.size()-1;i++) {
	System.out.println(list.get(i));
}
//3rd element
System.out.println("the third element in the list is "+list.get(2));
//size of the list
System.out.println("size of the list is "+list.size());
//to remove 5th element
list.remove(4);
//to print the size of the list again after removal
System.out.println("the size of the list after removing element is "+list.size());
	}

}
