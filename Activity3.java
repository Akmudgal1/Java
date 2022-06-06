package Activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double seconds=1000000000;
double Mercuryseconds=0.2408467;
double VenusSeconds = 0.61519726;
double Marsseconds=1.8808158;
double Earthseconds=31557600;
double Jupiterseconds= 11.862615;
double Saturnseconds=29.447498;
double Uranusseconds=84.016846;;
double Neptuneseconds=164.79132;
System.out.println("age on Mercury is"+ seconds/Earthseconds/Mercuryseconds);
System.out.println("age on Venus is"+ seconds/Earthseconds/VenusSeconds );
System.out.println("age on mars	 is"+ seconds/Earthseconds/Marsseconds);
System.out.println("age on jupiter is"+ seconds/Earthseconds/Jupiterseconds);
System.out.println("age on saturn is"+ seconds/Earthseconds/Saturnseconds);
System.out.println("age on Uranus  is"+ seconds/Earthseconds/Uranusseconds);
System.out.println("age on Neptune is"+ seconds/Earthseconds/Neptuneseconds);
System.out.println("age on earth is"+seconds/Earthseconds);
	}

}
