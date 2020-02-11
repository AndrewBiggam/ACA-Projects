import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
import java.awt.event.*;
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

class dinero extends JFrame implements ActionListener{
	
	JPanel coinWindow; 

	JTextArea txtArea;
	
	JTextArea txtArea2;
	
	JScrollPane pane; 
	
	JButton reRoll;
	
	public void Roll()
	{
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[20];
	
		DecimalFormat twoPlaces = new DecimalFormat("0.00");
	
		int sum = 0;
		
	
		for(int i = 0; i < Duckets.pocketChange.length; i++)
		{
			Duckets.pocketChange[i] = randomcoin();
		}
		
	
		for(robertD.Moneys coin: Duckets.pocketChange){ 
			int value = Duckets.getValue(coin);
			
			txtArea.append("$" + twoPlaces.format((double)value/100) + " " + coin + "\n");
			sum += Duckets.getValue(coin);
		}
		
		txtArea2.append("This is how poor you are: " + "$" + twoPlaces.format((double)sum/100));
		
	}
	
	public dinero()
	{
		super("My Pocket");
		setSize(400, 400);
		setDefaultCloseOperation( EXIT_ON_CLOSE );

		JPanel coinWindow = new JPanel();
		
		add(coinWindow);
		
		txtArea = new JTextArea( 20, 30 );
		
		txtArea2 = new JTextArea( 1, 15 );
		
		reRoll = new JButton("I demand a recount!");
		
		pane = new JScrollPane( txtArea );
		
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true) ;
		
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		coinWindow.add(pane);
		
		coinWindow.add(txtArea2);
		
		coinWindow.add(reRoll);
		
		reRoll.addActionListener(this);
		
		setVisible( true );
	}
	
	public void actionPerformed( ActionEvent event )
	{
		if( event.getSource() == reRoll)
		{
			txtArea.setText("");
			txtArea2.setText("");
			Roll();
			
		}
	}
	public static robertD.Moneys randomcoin()
	{
		Random r = new Random();
		int newcoin = r.nextInt(6);
		return robertD.Moneys.values()[newcoin];
	}
	
	
	public static void main(String... v){
		
		dinero gui = new dinero();
		
		gui.Roll();
		
	}
}