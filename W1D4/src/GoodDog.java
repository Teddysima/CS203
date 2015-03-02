
public class GoodDog {
	
	private int size;
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	void bark(){
		if (size > 60){
			System.out.println("Wooof! Wooof!");
		}else if (size > 14){
			System.out.println("Ruff! Ruff!");
		}else{
			System.out.println("Yip! Yip!");
		}
	}
}
