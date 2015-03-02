
public class TestDriverGuSc {
	
	

	public static void main(String[] args) {
		
		
		
		GuineaPig g = new GuineaPig();
		Scientist s = new Scientist();
		
		g.setName("pig");
		int y = 5;
		
		System.out.println(g.getName());
		System.out.println(y);
		
		
		s.changeThis(y,g );
		
		System.out.println(g.getName());
		System.out.println(y);
	}	
}
		
		
