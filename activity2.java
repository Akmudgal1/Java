package Activities;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,34,10,5,10};
		int sum =0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==10) {
			sum= sum+a[i];
			
			}
	
		}
		if (sum==30) {
System.out.println("sum is 30");
	}
		else {
			System.out.println("sum is not 30");
		}
	}

}
