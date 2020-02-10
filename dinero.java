import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar;
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

class dinero extends JFrame{
	
	JPanel coinWindow = new JPanel();
	
	JTextField coinText = new JTextField(38);
	JTextField sumText = new JTextField("Default Text", 38);
	
	JTextArea txtArea = new JTextArea( 5, 37 );
	
	JScrollPane pane = new JScrollPane( txtArea );
	
	public dinero()
	{
		super("My Pocket");
		setSize(500, 200);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(coinWindow);
		
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true) ;
		
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		coinWindow.add(coinText);
		coinWindow.add(sumText);
		coinWindow.add(pane);
		
		setVisible( true );
	}
	
	public static robertD.Moneys randomcoin()
	{
		Random r = new Random();
		int newcoin = r.nextInt(6);
		return robertD.Moneys.values()[newcoin];
	}
	
	
	public static void main(String... v){
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[20];
	
		DecimalFormat twoPlaces = new DecimalFormat("0.00");
		
		dinero gui = new dinero();
	
		int sum = 0;
		
	
		for(int i = 0; i < Duckets.pocketChange.length; i++)
		{
			Duckets.pocketChange[i] = randomcoin();
		}
		
	
		for(robertD.Moneys coin: Duckets.pocketChange){ 
			int value = Duckets.getValue(coin);
			
			System.out.println("$" + twoPlaces.format((double)value/100) + " " + coin);
			sum += Duckets.getValue(coin);
		}
		System.out.println();
		System.out.println("This is how poor you are: " + "$" + (double)sum/100);
		
		
	}
}