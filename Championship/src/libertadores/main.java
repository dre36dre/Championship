package libertadores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {
	public static void main(String[] args) {
		
		Club c[]=new Club[20];
		c[0]=new Club("Palmeiras");
//		System.out.println(c[0].toString());
		
		c[1]=new Club("Bahia");
//		System.out.println(c[1].toString());
		c[2]=new Club("São Paulo");
		c[3]=new Club("Vasco");
		c[4]=new Club("Vitória");
		
		
		Match m[]=new Match[40];
		m[0]=new Match(c[1], c[0],1,0);
		m[1]=new Match(c[0], c[2], 2, 0);
		m[2]=new Match(c[0], c[3], 3, 0);	
		m[3]=new Match(c[4],c[0], 2, 2);
		
		m[0].play();
		m[1].play();
		m[2].play();
		m[3].play();
		
		List<Match> matches=Arrays.asList(m[0],m[1],m[2] ,m[3]);
		
		for(Match ma: matches) {
		ma.Matches();
		}
		
		
		
		List<Club> table= Arrays.asList(c[3],c[1],c[0],c[4]);
		
		table.sort(Comparator.comparing(Club::getPoints).reversed());
		
		System.out.println("\n=========================CHAMPIONSHIP TABLE==========================");
		
		for(Club club: table) {
			System.out.println(club);
		}
		
		

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