
public class Main {

	public static void main(String[] args) {

		Auto auto1 = new Auto("Toyota", "Corolla", 10);
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();	
	}

}

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto()
	{
		merkki = "";
		malli = "";
		bensanMaara = 0;
	}
	
	public Auto(String merkki, String malli, int bensa)
	{
		this.merkki = merkki;
		this.malli = malli;
		bensanMaara = bensa;
	}


	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		bensanMaara -= 1 ;
			
		{
			System.out.println("Auto kiihtyy");
		}
			
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan m‰‰r‰: " + bensanMaara);
		System.out.println();
	}
}
