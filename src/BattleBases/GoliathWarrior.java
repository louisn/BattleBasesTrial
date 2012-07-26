package BattleBases;

public class GoliathWarrior extends AbstractWarrior {

	@Override
	public void spawn() {
		this.healthPoints = 250;
		this.attackStrength = 50;
		this.cost = 550;
	}

}
