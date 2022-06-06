package Activities;

public class CustomExceptions extends Exception {
	private String message="";
	public CustomExceptions (String message) {
		this.message= message;
	}
	@Override
	public String getMessage() {
	    return message;
	}
	public static void main(String[] args) {
		
	}

}
