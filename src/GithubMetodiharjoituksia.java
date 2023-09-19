import java.util.Scanner;
public class GithubMetodiharjoituksia {

	public static void main(String[] args) {
		

	//kutsu tehtävän 1 metodia
		tulostus();
		
	//kutsu tehtävän 2 metodia
		tulo(10);
		
	//kutsu tehtävän 3 metodia
		kysymys();
	
	//kutsu tehtävän 4 metodia
		pintaAla(10, 5);

	}// mainin loppu
	
	
	//1. Tee metodi, joka tulostaa "Metodi-harjoituksia"
		public static void tulostus()
		{
			System.out.println("Metodi-harjoituksia");
		}//tulostus-metodin loppu
		
		
	//2. Tee metodi, joka kertoo parametrina saadun luvun tuhannella ja tulostaa tulon
		public static void tulo(int luku)
		
		{
			System.out.println(luku * 1000);
		}//tulo-metodin loppu
		
		
	//3. Metodi kysyy käyttäjältä luvun ja kutsuu sitten tulo-metodia.
		public static void kysymys()
		
		{
			Scanner in = new Scanner(System.in);
			String vastaus;
			System.out.println("Anna minulle jokin luku.");
			vastaus = in.nextLine();
			int vastausInt = Integer.parseInt(vastaus);
			
			tulo(vastausInt);
		}//kysymys-metodin loppu
		
		
	//4. Tee metodi, joka laskee pinta-alan. Pyydä pituus ja leveys mainissä ja kutsu metodia. 
		public static void pintaAla(int pituus, int leveys)
		
		{
			System.out.println(pituus * leveys);
		}//pintaAla-metodin loppu

}
