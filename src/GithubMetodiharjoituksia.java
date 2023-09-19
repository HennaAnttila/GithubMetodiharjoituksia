import java.util.Scanner;
import java.util.Arrays;
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

	//tulosta tehtävän 5 palautettu arvo
		System.out.println(pintaAlaPalautus(3, 5));
	//Jos pinta-ala on isompi kuin 50, tulostetaan: ”Onpa iso huone”
		if (pintaAlaPalautus(10, 20) > 50)
			{
				System.out.println("Onpa iso huone");
			}
		
	//Tee mainissa taulukko ja lisää taulukkoon muutamia sanoja
		
		String hedelmat [];
		hedelmat = new String [5];
		hedelmat [0] = "banaani";
		hedelmat [1] = "omena";
		hedelmat [2] = "greippi";
		hedelmat [3] = "ananas";
		hedelmat [4] = "appelsiini";
				
	//kutsu tehtävän 6 metodia
		tulostaTaulukkoLajiteltuna(hedelmat);
		
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
		
		
	//5. Tee metodi, joka laskee pinta-alan, mutta palauttaa arvon.
		
		public static int pintaAlaPalautus(int pituus, int leveys)
		{
			int pintaAla = pituus * leveys;
			return pintaAla;
		}//pintaAlaPalautus-metodin loppu
		
		
	//6.Tee tulostaTaulukkoLajiteltuna-metodi, joka lajittelee taulukon ja tulostaa sanat riveittäin
		public static void tulostaTaulukkoLajiteltuna (String[] hedelmat)
		{
			Arrays.sort(hedelmat);
			for (int i = 0 ; i < hedelmat.length ; i++)
			{
				System.out.println(hedelmat [i]);
			}
		}//tulostaTaulukkoLajiteltuna-metodin loppu

}
