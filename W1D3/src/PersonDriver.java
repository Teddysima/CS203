
public class PersonDriver {

	public static void main(String[] args) {
		Person [] teddy = new Person [5];
		
		Person p = new Person();
		p.firstName="John";
		p.lastName="Doe";
		
		for(int i = 0; i < teddy.length; i++){
			teddy[i] = p; // new Person("John", "Doe");	
		}
		
		teddy[0].lastName = "Smith";
		
		
		
		for(int i = 0; i < teddy.length; i++){
			System.out.println(teddy[i].firstName + " " + teddy[i].lastName);
		} 
	}

}
