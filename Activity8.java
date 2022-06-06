package Activities;

public class Activity8 {
	static  void ExceptionTest(String s) throws CustomExceptions {
		if(s==null) {
			throw new CustomExceptions("string is null");
		}
		else {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Activity8.ExceptionTest(null);
			Activity8.ExceptionTest("No execution");
		} catch (CustomExceptions e) {
			// TODO Auto-generated catch block
			System.out.println("caught exception"+ e.getMessage());;
		}
		
	}

}
