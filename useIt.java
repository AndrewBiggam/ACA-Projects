class Xamples{
	
	public String ShowYours() {
		
	}
	
	public String ShowMine() {
		
	}
	
	public int ShowYours(String C) {
		
	}
	
	public int ShowMine(String D) {
		
	}
	
	public double ShowYours(int C) {
		
	}
	
	public double ShowMine(int D) {
		
	}

}
class useIt{
	
	Xamples iWill = new Xamples();
	
	int saveInt = 0;
	int SaveString = "testing";
	int SaveDouble = 42.42;
	
	iWill.ShowMine();
	
	iWill.ShowYours();
	
	iWill.ShowMine("i'm telling mom");
	
	iWill.ShowYours("ok");
	
	iWill.ShowMine(42);
	
	iWill.ShowYours(24);
	
	System.out.println();

}