package Activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array before sorting is ");
int a[]= {7,3,5,1,8,9,10};
for(int i=0;i<=a.length-1;i++) {
	System.out.println(a[i]);
}
System.out.println("array after sorting is");
for(int j=0;j<=a.length-1;j++) {
	for(int k=j+1;k<=a.length-2;k++)
	if(a[j]>a[k]){
		int temp=a[j];
		a[j]=a[k];
		a[k]= temp;
	
	}
	System.out.println(a[j]);
}

	}

}
