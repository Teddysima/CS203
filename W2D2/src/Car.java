
public class Car extends Automobile {
	
	
	private boolean convertable;
	private int trunkCapacity;
	
	

	public boolean isConvertable() {
		return convertable;
	}
	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}
	public int getTrunkCapacity() {
		return trunkCapacity;
	}
	public void setTrunkCapacity(int trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}
	public void accelerate() {
		setSpeed(20);
		
	}

}
