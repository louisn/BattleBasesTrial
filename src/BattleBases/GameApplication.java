package BattleBases;

public class GameApplication {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		GameLoop game = new GameLoop();
		game.init();
		int gameTimer = 0;
		while (game.isRunning){
			gameTimer++;
			if(gameTimer >= Integer.MAX_VALUE){
				System.out.println("You have played this game for too long, go outside and get some exercise!");
				game.isRunning=false;
			}
			game.update(gameTimer);
			game.draw();
			Thread.sleep(100);
		}
	}

}
