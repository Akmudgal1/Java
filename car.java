package Activities;

public class car {
//A String color
//	A String transmission
//	An int make
//	An int tyres
//	An int doors
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	car(){
		tyres=4;
		doors=4;
		
	}
	public void displayCharacteristics(){
		System.out.println("the color of the car is "+ color);
		System.out.println("the make of the car is "+ make);
		System.out.println("the transmission of the car is "+ transmission);
		
	}
	public void accelerate() {
		System.out.println("the car is moving forward");
	}
	public void brake() {
		System.out.println("the car has stopped");
	}
}

