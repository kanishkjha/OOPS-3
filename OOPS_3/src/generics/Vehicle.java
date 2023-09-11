package generics;

public class Vehicle implements PrintInterface{
	

	protected String color;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		
		this.maxSpeed=maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
//	public abstract boolean isMotorized();
	
//	public abstract String getCompany();
	
	public final void print() {
		
		System.out.println("Vehicle Color : "+color);
		System.out.println("Vehicle Speed : "+maxSpeed);
	}
}

