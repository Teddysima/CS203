
public class Car2 {
	private int x=0;
	private int y=0;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void MoveUp(int y){
		this.y += 1;
	}
	
	public void MoveLeft(int x){
		this.x -= 2;
	}
	
	public void MoveDown(int y){
		this.y -= 5;
	}
	
	public void MoveRight(int x){
		this.x += 1;
	}
	public void returnLocation(){
		System.out.println("(" + this.x + "," + this.y + ")");
		
	}

}
