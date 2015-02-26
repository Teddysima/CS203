
public class Car {
	private int x=0;
	private int y=0;
	
	/*Car() {
		this.x =0;
		this.y = 0;
	}
	
	Car(int x, int y) {
		this.x = x;
		this.y = y;
	}
	*/
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

	public void MoveUp(){
		this.y += 1;
	}
	
	public void MoveLeft(){
		this.x -= 2;
	}
	
	public void MoveDown(){
		this.y -= 1;
	}
	
	public void MoveRight(){
		this.x += 1;
	}
	public void PrintLocation(){
		System.out.println( "(" + this.x + "," + this.y + ")");
		
	}

}