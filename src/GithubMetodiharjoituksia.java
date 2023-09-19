
public class GithubMetodiharjoituksia {

	public static void main(String[] args) {
		

	//kutsu tehtävän 1 metodia
		tulostus();
		
	//kutsu tehtävän 2 metodia
		tulo(10);

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

}
