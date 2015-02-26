
public class PersonDriver {

	public static void main(String[] args) {
		Person [] teddy = new Person [5];
		Person p = new Person ();
		p.firstname = "john Doe";
	
		teddy[0] = p;
		teddy[1] = p;
		teddy[2] = p;
		teddy[3] = p;
		teddy[4] = p;
		
		teddy[0].firstname = "john smith";
		
		System.out.println(teddy[0].firstname);
		System.out.println(teddy[1].firstname);
		System.out.println(teddy[2].firstname);
		System.out.println(teddy[3].firstname);
		System.out.println(teddy[4].firstname);
		

	}

}
