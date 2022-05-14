package animals;

public class GiantBat extends Mammal{
	public GiantBat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("Ekk Ekk.");
		this.adjustEnergyLevel(-50);
	}
	
	public void eatHumans() {
		this.adjustEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("Roaring fire and screaming people.");
		this.adjustEnergyLevel(-100);
	}
}
