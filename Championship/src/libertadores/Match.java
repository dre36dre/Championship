package libertadores;

public class Match  implements GameMatch {

	Club home, visitor;
	protected int homeGoals;
	protected int visitingGoals;
	
	public Match(Club home, Club visitor,int homeGoals, int visitingGoals) {
		super();
		this.home=home;
		this.visitor=visitor;
		this.homeGoals=homeGoals;
		this.visitingGoals=visitingGoals;
//		this.home.setName(this.home.getName());
//		this.visitor.setName(this.visitor.getName());
	}
	

	public int getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}

	public int getVisitingGoals() {
		return visitingGoals;
	}
	public void setVisitingGoals(int visitingGoals) {
		this.visitingGoals = visitingGoals;
	}

	public Club getHome() {
		return home;
	}

	public void setHome(Club home) {
		this.home = home;
	}

	public Club getVisitor() {
		return visitor;
	}

	public void setVisitor(Club visitor) {
		this.visitor = visitor;
	}

	@Override
	public String toString() {
		return     home + " "
				 + homeGoals+ " X "
					+ visitingGoals
				 +" "+ visitor   ;
		
	}


	@Override
	public void win() {
		if(homeGoals == (visitingGoals)) {
			System.out.println("Empatou");			
		}else if(homeGoals > (visitingGoals)){
			System.out.println(home+" venceu");
		}else {
			System.out.println(visitor + "venceu");
		}
	}

	@Override
	public void lose() {
		
	}

	@Override
	public void draw() {
		
	}


	@Override
	public void showScoreboard() {
		System.out.println("=========================PLACAR====================");
		System.out.println(home+ " X " + getVisitor() );
	}

	
	
	
	
}
