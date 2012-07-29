package BattleBases;

public class Army {
	public AbstractWarrior[] armyQueue;
	public AbstractWarrior head;
	public AbstractWarrior tail;
	public int numOfWarriors;
	private int headIndex;
	private int tailIndex;

	public Army(AbstractWarrior[] warriors) {
//		armyQueue = new AbstractWarrior[numOfWarriors];//creates size of array
//		for (int x = 0; x < numOfWarriors; x++) {
//			armyQueue[x] = new GruntWarrior();
//		}
		armyQueue = warriors;
		headIndex = 0;
		numOfWarriors = warriors.length ;
		tailIndex = numOfWarriors-1;
		head = armyQueue[0];
		tail = armyQueue[numOfWarriors - 1];
	}

	public AbstractWarrior getHead() {
		return this.head;
	}

	public AbstractWarrior getTail() {
		return this.tail;
	}

	public AbstractWarrior next() {
		if (headIndex == tailIndex) {
			this.head = null;
			return null;
		} else {
			headIndex++;
			this.head = armyQueue[headIndex];
			return head;
		}
	}
}
