package main;

import animals.GiantBat;

public class Test {

	public static void main(String[] args) {
		GiantBat gB1 = new GiantBat();
		gB1.displayEnergy();
		gB1.attackTown();
		gB1.displayEnergy();
		gB1.attackTown();
		gB1.displayEnergy();
		gB1.attackTown();
		gB1.displayEnergy();
		gB1.eatHumans();
		gB1.displayEnergy();
		gB1.eatHumans();
		gB1.displayEnergy();
		gB1.fly();
		gB1.displayEnergy();
		gB1.fly();
		gB1.displayEnergy();
	}

}
