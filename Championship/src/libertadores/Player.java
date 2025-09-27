package libertadores;

public class Player {
 protected String name;
 protected int age;
 protected int shirt;
 protected String position;
 protected String nationality;
 public Player(String name, int age, int shirt, String position, String nationality) {
	super();
	this.name = name;
	this.age = age;
	this.shirt = shirt;
	this.position = position;
	this.nationality = nationality;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
 public int getShirt() {
	return shirt;
 }
 public void setShirt(int shirt) {
	this.shirt = shirt;
 }
 public String getPosition() {
	return position;
 }
 public void setPosition(String position) {
	this.position = position;
 }
 public String getNationality() {
	return nationality;
 }
 public void setNationality(String nationality) {
	this.nationality = nationality;
 }
 @Override
 public String toString() {
	return "Player [name=" + name + ", "
			+ "age=" + age + ","
			+ " shirt=" + shirt + ","
							+ " position=" + position + ","
									+ " nationality="
			+ nationality + "]";
 }
 
 
 
 
}
