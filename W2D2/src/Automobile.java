
public class Automobile {
	
	private String mark;
	private String Model;
	private int year;
	private String color;
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void move(){
		System.out.println("tak tak!");
	}
	public void accelerate() {
		this.speed = this.speed + 10;
		
	}
    public void brake() {
    	if (speed>=10)
    		speed-=10;
	}
}
