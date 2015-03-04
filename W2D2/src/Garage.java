import java.util.ArrayList;

public class Garage {
	
	private Automobile automobile;
	private ArrayList<Item> Auto = new ArrayList<Item>();


	public void store(Automobile a) {
		automobile = a;

	}

	public void store(Item i) {
		Auto.add(i);

	}

	public Automobile retrieve() {
		return this.automobile;

	}

	public Item retrieve(int index) {
		return Auto.get(index);

	}

}
