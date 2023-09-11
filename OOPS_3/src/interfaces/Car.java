package interfaces;

public class Car extends Vehicle implements CarInterface {
	
	@Override
	public int getMaxSpeed() {
		return 10;
	}

	@Override
	public void print() {
		
	}
	
	public String getCompany() {
		return "Audi";
	}
}
