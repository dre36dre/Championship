package libertadores;

public class Club {
	protected String name;
	protected String dataFoundation;
	protected String stadiumName;
	public Club(String name, String stadiumName,String dataFoundation) {
		super();
		this.name = name;
		this.dataFoundation = dataFoundation;
		this.stadiumName = stadiumName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataFoundation() {
		return dataFoundation;
	}
	public void setDataFoundation(String dataFoundation) {
		this.dataFoundation = dataFoundation;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	@Override
	public String toString() {
		return "Clube:" + name + "\n"
				+"Date of fundation:" + dataFoundation + "\n"
				+"Stadium Name:" + stadiumName;
	}
	
	
	
	
}
