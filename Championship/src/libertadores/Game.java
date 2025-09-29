package libertadores;


public class Game {
	protected String home;
	protected String visitor;
	protected boolean won=false ;
	protected float time;
	protected boolean underway;
	protected int scoreboard;
	
	
	public Game(String home, String visitor, boolean won, float time, boolean underway, int scoreboard) {
		super();
		this.home = home;
		this.visitor = visitor;
		this.won = won;
		this.time = time;
		this.underway = underway;
		this.scoreboard = scoreboard;
	}


	public String getHome() {
		return home;
	}


	public void setHome(String home) {
		this.home = home;
	}


	public String getVisitor() {
		return visitor;
	}


	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}


	public boolean isWon() {
		return won;
	}


	public void setWon(boolean won) {
		this.won = won;
	}


	public float getTime() {
		return time;
	}


	public void setTime(float time) {
		this.time = time;
	}


	public boolean isUnderway() {
		return underway;
	}


	public void setUnderway(boolean underway) {
		this.underway = underway;
	}


	public int getScoreboard() {
		return scoreboard;
	}


	public void setScoreboard(int scoreboard) {
		this.scoreboard = scoreboard;
	}


	@Override
	public String toString() {
		return "Game [home=" + home + ", visitor=" + visitor + ", won=" + won + ", time=" + time + ", underway="
				+ underway + ", scoreboard=" + scoreboard + "]";
	}
	
	
	
	
	
	
	
	

}


