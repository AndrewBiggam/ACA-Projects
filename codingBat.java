import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

class codingBat extends JFrame implements ActionListener
{
	public boolean cigarParty(int cigars, boolean isWeekend) 
	{
		if(isWeekend && cigars >=40)
			return true;
		
		if(cigars >= 40 && cigars <= 60)
			return true;
		
		return false;
	}
	
	public int[] plusTwo(int[] a, int[] b) 
	{
		int[] x = new int[4];
		x[0]=a[0];
		x[1]=a[1];
		x[2]=b[0];
		x[3]=b[1];
		return x;
	}
	
	public String helloName(String name) 
	{
		return "Hello " + name + "!";
	}

	
	JPanel party = new JPanel();
	JPanel plus2 = new JPanel();
	JPanel helloName = new JPanel();
	
	JLabel pTitle = new JLabel("Cigar Party");
	JLabel pCigars = new JLabel("Number of Cigars");
	JLabel pWeekend = new JLabel("Party like the weekend");
	JLabel pBlank1 = new JLabel("");
	JLabel pBlank2 = new JLabel("");
	JLabel pBlank3 = new JLabel("");
	JLabel pBlank4 = new JLabel("");
	JLabel pBlank5 = new JLabel("");
	JLabel pBlank6 = new JLabel("");
	JLabel pBlank7 = new JLabel("");
	JLabel pBlank8 = new JLabel("");
	
	JLabel twoTitle = new JLabel("Plus Two Arrays");
	
	JLabel helloTitle = new JLabel("Hello! What's Yo Name?");
	
	JTextField pCigarCount = new JTextField(5);
	JTextField pResults = new JTextField(25);
	
	JTextField twoA0 = new JTextField(5);
	JTextField twoA1 = new JTextField(5);
	JTextField twoB0 = new JTextField(5);
	JTextField twoB1 = new JTextField(5);
	JTextField twoC0 = new JTextField(5);
	JTextField twoC1 = new JTextField(5);
	JTextField twoC2 = new JTextField(5);
	JTextField twoC3 = new JTextField(5);
	
	JTextField hello01 = new JTextField(10);
	JTextField hello02 = new JTextField(20);
	
	JCheckBox pIsWeekend = new JCheckBox();
	
	JButton pGo = new JButton("Go!");
	
	JButton twoGo = new JButton("GO!");
	//JButton twooG = new JButton("!OG");
	
	JButton helloGo = new JButton("Go!");
	
	JMenuItem cb1, cb2, cb3;
	
	JMenu Skillz;
	
	JMenuBar CodingBAMenu;
	
	JPanel partyGrid = new JPanel(new GridLayout(5,3));
	JPanel plus2Grid = new JPanel(new GridLayout(2,2));
	JPanel plus2GridSouth = new JPanel(new GridLayout(1,4));
	
	public codingBat()
	{
		super("CodingBat App");
		setSize(900, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CodingBAMenu = new JMenuBar();
		Skillz = new JMenu("Hey Kids! Want some menu items?");
		cb1 = new JMenuItem("Smoking With Squirrels");
		cb2 = new JMenuItem("Plus 2 Boogaloo");
		cb3 = new JMenuItem("Gimmie Yo Name");
		
		pGo.addActionListener(this);
		twoGo.addActionListener(this);
		helloGo.addActionListener(this);
		
		partyGrid.add(pBlank1);
		partyGrid.add(pTitle);
		partyGrid.add(pBlank2);
		
		partyGrid.add(pCigars);
		partyGrid.add(pBlank3);
		partyGrid.add(pWeekend);
		
		partyGrid.add(pCigarCount);
		partyGrid.add(pBlank4);
		partyGrid.add(pIsWeekend);
		
		partyGrid.add(pBlank5);
		partyGrid.add(pGo);
		partyGrid.add(pBlank6);
		
		partyGrid.add(pBlank7);
		partyGrid.add(pResults);
		partyGrid.add(pBlank8);
		
		party.add(partyGrid);
		
		plus2.add("North", twoTitle);
		plus2Grid.add(twoA0);
		plus2Grid.add(twoA1);
		plus2Grid.add(twoB0);
		plus2Grid.add(twoB1);
		plus2.add("Center", plus2Grid);
		plus2.add("West", twoGo);
		//plus2.add("East", twooG);
		plus2GridSouth.add(twoC0);
		plus2GridSouth.add(twoC1);
		plus2GridSouth.add(twoC2);
		plus2GridSouth.add(twoC3);
		plus2.add("South",plus2GridSouth);
		
		helloName.add(helloTitle);
		helloName.add(hello01);
		helloName.add(helloGo);
		helloName.add(hello02);
		
		
		
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		
		Skillz.add(cb1);
		Skillz.add(cb2);
		Skillz.add(cb3);
		
		CodingBAMenu.add(Skillz);
		
		setJMenuBar(CodingBAMenu);
		
		//setLayout(new BorderLayout());

		add("Center",party);
		
		//add(party);
		//add(plus2);
		//add(helloName);
		
		pTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pCigars.setHorizontalAlignment(SwingConstants.CENTER);
		pCigarCount.setHorizontalAlignment(SwingConstants.CENTER);
		pWeekend.setHorizontalAlignment(SwingConstants.CENTER);
		pIsWeekend.setHorizontalAlignment(SwingConstants.CENTER);
		pResults.setHorizontalAlignment(SwingConstants.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		codingBat gui = new codingBat();
	}
	
	public void cigarAction()
	{
		try
		{
			int CountOfCigars = Integer.valueOf(pCigarCount.getText());
			boolean weekend = pIsWeekend.isSelected();
			String output = "";
			if(cigarParty(CountOfCigars, weekend))
				output = "This party is a hoot!";
			else
				output = "This party blows smoke!";
			pResults.setText(output);
		}
		catch(Exception e)
		{
			pResults.setText("You know what a number is right?");
		}
	}
	
	public void plus2Action(){
		
		int[] firstArray = new int[]{Integer.valueOf(twoA0.getText()),Integer.valueOf(twoA1.getText())};
		int[] nextArray = new int[]{Integer.valueOf(twoB0.getText()),Integer.valueOf(twoB1.getText())};
		
		int[] output =  plusTwo(firstArray, nextArray);
		
		twoC0.setText(String.valueOf(output[0]));
		twoC1.setText(String.valueOf(output[1]));
		twoC2.setText(String.valueOf(output[2]));
		twoC3.setText(String.valueOf(output[3]));
		
	}
	
	public void helloNameAction()
	{
		String nameField = hello01.getText();
		String output = "";
		
		output = helloName(nameField);
		
		hello02.setText(output);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource()== pGo)
			cigarAction();
		if(event.getSource()== twoGo)
			plus2Action();
		if(event.getSource()== helloGo)
			helloNameAction();
		
		if(event.getSource()== cb1)
			smokePressed();
		if(event.getSource()== cb2)
			plus2Pressed();
		if(event.getSource()== cb3)
			helloNamePressed();
		
		
	}
	
	public void smokePressed()
	{
		add(party);
		party.setVisible(true);
		plus2.setVisible(false);
		helloName.setVisible(false);
	}
	
	public void plus2Pressed()
	{
		add(plus2);
		party.setVisible(false);
		plus2.setVisible(true);
		helloName.setVisible(false);	
	}
	
	public void helloNamePressed()
	{
		add(helloName);
		party.setVisible(false);
		plus2.setVisible(false);
		helloName.setVisible(true);
	}
	
}