package animals;

public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Energy level: " + energyLevel);
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void adjustEnergyLevel(int energyAmount) {
		this.energyLevel += energyAmount;
	}
}
