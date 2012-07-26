package BattleBases;

public class GameLoop {
	long time = 0;
	Player winner = null;
	Player loser = null;
	Player player1 = null;
	Player player2 = null;
	public boolean isRunning = true;
	public void init(){
		player1 = new Player("Student");
		player2 = new Player("Dorin");
	}
	public void update(int gameTimer){
		
		winner = player1.war(player2, gameTimer);
		if (winner != null){
			System.out.println("winner = "+ winner.getName());
			isRunning = false;
		}
		//dealHit();
		//takeHit();
		//if(player1.)
	}
	public void draw(){
		System.out.println("player 1 = " + player1.getName() + " health = " + player1.getHealth());
		System.out.println("player 2 = " + player2.getName() + " health = " + player2.getHealth());
	}
	
	
}
