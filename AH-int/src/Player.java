public class Player {
	String playerName;
	int pNumber; //Jersey number
	int pScored; //points scored
	int steals;
	int blocks;    // all will be used to calculate score
	int rebounds;
	int fouls; //fouls made
	
	Player(String playerName, int pNumber, int pScored, int steals, int blocks, int rebounds, int fouls) {
		this.playerName = playerName;
		this.pNumber = pNumber;
		this.pScored = pScored;
		this.steals = steals;
		this.blocks = blocks;
		this.rebounds = rebounds;
		this.fouls = fouls;
		
	}
		
	void playerScore() {
		int score = (pScored + steals + blocks + rebounds) - fouls;
		
		System.out.println( playerName + " has a score of " + score + " and wears number " + pNumber);
		
	}
}

