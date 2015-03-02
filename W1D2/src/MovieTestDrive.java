
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie one = new Movie();
		one.setTitle ("Gone with the stock");
		one.setGenre ("Tragic");
		one.setRating (-2);
		one.playIt();
		System.out.println(one.getGenre());
		System.out.println(one.getRating());
		System.out.println(one.getTitle());
		
		Movie two = new Movie();
		//two.title = "Lost in cubicle space";
		//two.genre = "Comedy";
		//two.rating = 5;
		//two.playIt();
		
		Movie three = new Movie();
		//three.title = "Byte Club";
		//three.genre = "Tragic but ultimately uplifting";
		//three.rating = 127;

	}

}
