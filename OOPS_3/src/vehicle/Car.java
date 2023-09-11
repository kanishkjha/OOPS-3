package vehicle;

public abstract class Car extends Vehicle{

	int numGears;
	boolean isConvertible;
	
	public Car() {
		super(100);
	}
	
	public Car(int numGears, int maxSpeed) {
		
		super(maxSpeed);
		this.numGears=numGears;
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	@Override
	public boolean isMotorized() {
		return true;
	}
	
	public void printCar() {
		
		super.print();
		System.out.println("Car numGears : "+numGears);
		System.out.println("Car isConvertible : "+isConvertible);
	}

}
