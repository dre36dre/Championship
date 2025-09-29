package libertadores;

public class Table {

	protected int points;
	protected int  matches;
	protected int wins;
	protected int draw;
	protected int loses;
	protected int goalsScored;
	protected int ownGoals;
	protected int goalDifference;
	public Table(int points, int matches, int wins, int draw, int loses, int goalsScored, int ownGoals,
			int goalDifference) {
		super();
		this.points = points;
		this.matches = matches;
		this.wins = wins;
		this.draw = draw;
		this.loses = loses;
		this.goalsScored = goalsScored;
		this.ownGoals = ownGoals;
		this.goalDifference = goalDifference;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
	public int getOwnGoals() {
		return ownGoals;
	}
	public void setOwnGoals(int ownGoals) {
		this.ownGoals = ownGoals;
	}
	public int getGoalDifference() {
		return goalDifference;
	}
	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}
	@Override
	public String toString() {
		return "Table Points=" + points + ","
				+ " matches=" + matches + ","
				+ " wins=" + wins + ","
				+ " draw=" + draw + ","
				+ " loses="	+ loses + ", "
				+ "goalsScored=" + goalsScored + ", "
				+ "ownGoals=" + ownGoals + ","
				+ " goalDifference="
				+ goalDifference + "]";
	}
	
	
	
	
	
}
