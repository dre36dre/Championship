package libertadores;

public class main {
	public static void main(String[] args) {
		
		Club c[]=new Club[20];
		c[0]=new Club("Palmeiras", "Allianz park","14/08/1914");
		System.out.println(c[0].toString());
		
		c[1]=new Club("Bahia", "Fonte Nova", "01/01/1931");
		System.out.println(c[1].toString());
		
		
		//		Game g[]= new Game[40];
//		g[0]=new Game("Bahia", "Palmeiras", 0,1);
//
//		g[0].showScoreboard();
//	
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