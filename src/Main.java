
public class Main {

	public static void main(String[] args) {

		
	}

}

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;

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
	
	private void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan m‰‰r‰: " + bensanMaara);
	}
}
