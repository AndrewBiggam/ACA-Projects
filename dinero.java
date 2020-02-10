import java.util.*;
class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar;
		public static Moneys randomcoin()
		{
			Random r = new Random();
			int newcoin = r.nextInt(6);
			return values()[newcoin];
		}
	}

	public int getValue(Moneys coin){

		int value = 0;
		switch (coin){
			case penny:
				value = 1;
				break;
			case nickel:
				value = 5;
				break;
			case dime:
				value = 10;
				break;
			case quarter:
				value = 25;
				break;
			case halfdollar:
				value = 50;
				break;
			case dollar:
				value = 100;
				break;
		}

		return value;
	}
}

class dinero{
	public static void main(String... v){
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[20];
	
		int sum = 0;
	
		for(int i = 0; i < Duckets.pocketChange.length; i++)
		{
			Duckets.pocketChange[i] = robertD.Moneys.randomcoin();
		}
		
		// give each of the coins a value
		for(robertD.Moneys coin: Duckets.pocketChange){ //might need different for loop
			System.out.println(Duckets.getValue(coin) );
			sum += Duckets.getValue(coin);
		}
		System.out.println();
		System.out.println("Dis is how much moolah you haz: " + "$" + (double)sum/100);
		
		
	}
}