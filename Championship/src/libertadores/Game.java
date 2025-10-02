package libertadores;


public class Game   implements GameMatch {
	protected String home;
	protected String visitor;
	protected int homeGoals;
	protected int visitorGoals;
	protected boolean won=false ;
	protected float time;
	protected boolean underway;
	protected int scoreboard;

	
	
	
	
	public Game(String home, String visitor, int homeGoals, int visitorGoals) {
		super();
		this.home = home;
		this.visitor = visitor;
		this.homeGoals = homeGoals;
		this.visitorGoals = visitorGoals;
//		this.won = won;
//		this.time = time;
//		this.underway = underway;
//		this.scoreboard = scoreboard;
	}

	public int getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}

	public int getVisitorGoals() {
		return visitorGoals;
	}

	public void setVisitorGoals(int visitorGoals) {
		this.visitorGoals = visitorGoals;
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

	
	@Override
	public void Matches() {
		System.out.println(getHome()+ getHomeGoals() +     " X "  + getVisitorGoals()      +getVisitor());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}


