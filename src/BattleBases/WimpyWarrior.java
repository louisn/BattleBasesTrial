package BattleBases;

public class WimpyWarrior extends AbstractWarrior {

	@Override
	public void spawn() {
		this.healthPoints = 100;
		this.attackStrength = 5;
		this.cost = 50;
	}

}
