package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
Random indexGen = new Random();
ArrayList <Integer> list= new ArrayList<Integer>();
while(scan.hasNextInt()) {
	list.add(scan.nextInt());
	Integer nums[] = list.toArray(new Integer[0]);
	int index= indexGen.nextInt(nums.length);
	 System.out.println("Index value is: " + index);
     System.out.println("Value in arary at generated index is: " + nums[index]);

     scan.close();
	}
}

	}



