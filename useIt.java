class Xamples{
	
	
	
	public int ShowYours() {
		return 11;
	}
	
	public int ShowMine() {
		return 10;
	}
	
	public String ShowYours(String C) {
		return "pork";
	}
	
	public String ShowMine(String D) {
		return "beef";
	}
	
	public double ShowYours(int C) {
		return 123.456;
	}
	
	public double ShowMine(int D) {
		return 456.789;
	}

}
class useIt{
	
	Xamples iWill = new Xamples();
	
	int saveInt = 0;
	int saveInt2 = 0;
	String SaveString = "testing";
	String SaveString2 = "gnitset";
	double SaveDouble = 42.42;
	double SaveDouble2 = 24.24;
	
	public String lacedMeth()
	{
	
		int saveInt = iWill.ShowMine();
		
		int saveInt2 = iWill.ShowYours();
		
		String SaveString = iWill.ShowMine("poopity scoop");
		
		String SaveString2 = iWill.ShowYours("shoop de woop");
		
		double SaveDouble = iWill.ShowMine(42);
		
		double SaveDouble2 = iWill.ShowYours(24);
		
		return /*System.out.println(*/saveInt + saveInt2 + SaveString + SaveString2 + SaveDouble + SaveDouble2 /*)*/;
		
	}
	public static void main(String args[])
	{
		
		useIt whatisthis = new useIt();
		
		System.out.println(whatisthis.lacedMeth());
	}
	

}