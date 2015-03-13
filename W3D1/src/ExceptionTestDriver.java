public class ExceptionTestDriver {

	public static void main(String[] args) {
		try {
			doThingsA();
		} catch (Exception e) {
			// e = new MyException("this is the wrong one:");
			System.out.println("some exception occurred");
		}

	}

	public static void doThingsA() throws MyException {

		doThingB();
	}

	public static void doThingB() throws MyException {
		try {
			doThingC();
		} catch (MyException e) {
			
		throw new MyException("DID NOT REALLY WANT TO DEAL WITH IT", e);
			
		} finally {
			System.out.println("finally we are doing it");
		}
	}

	public static void doThingC() {
		System.out.println("This is C");
		doThingD();
	}

	public static void doThingD() throws MyException {
		throw new MyException("a message");
	}
}
