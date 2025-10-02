package libertadores;

public class Club {
	private String name;
    private int points;
    private int wins;
    private int draws;
    private int losses;
    private int goalsFor;
    private int goalsAgainst;
	
	public Club(String name) {
//		super();
		this.name = name;
//		this.dataFoundation = dataFoundation;
//		this.stadiumName = stadiumName;
	}
	
	public void updateMatch(int goalsScored, int goalsConceded) {
        this.goalsFor += goalsScored;
        this.goalsAgainst += goalsConceded;

        int points=0;
		if (goalsScored > goalsConceded) {        // win
            int wins=0;
			this.wins++;
            this.points += 3;
            this.wins++;
        } else if (goalsScored == goalsConceded) { // draw
            int draws=0;
			this.draws++;
            this.points += 1;
        } else {                                   // lose
            int losses=0;
			this.losses++;
        }
    }
	
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		 return name + " | Pts: " + points + " | V: " + wins +
	               " | E: " + draws + " | D: " + losses +
	               " | GP: " + goalsFor + " | GC: " + goalsAgainst;
	}
	
	
	
	
}
