package libertadores;

public class main {
	public static void main(String[] args) {
		
		Club c[]=new Club[20];
		c[0]=new Club("Palmeiras");
//		System.out.println(c[0].toString());
		
		c[1]=new Club("Bahia");
//		System.out.println(c[1].toString());
		
		Match m[]=new Match[40];
		m[0]=new Match(c[0], c[1],4,0);
		
//		c[0].toString();
		
		 System.out.println( m[0].toString());
		
		

	}
}







//Usando java.time.LocalDate 
//public static void main(String[] args) { 
//String data = "70/12/2040"; 
//try { 
//LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
//System.out.println(date); 
//} catch (DateTimeException ex) { 
//System.out.println("Formato inválido."); 
//} 
//}