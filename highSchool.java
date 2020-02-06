class highSchool
{
	String output = "";
	int counter = 1;
	
	public String runLength(String a) 
	{
		for (int i = 0; i < a.length(); i++)
		{
			String num = Integer.toString(counter);
			char letter = a.charAt(i);
			
			if(i + 1 == a.length())			
			{
				output += num +"" + letter;
				break;
			}
			
			if(a.charAt(i)==a.charAt(i+1))
			{
					counter++;
			}
			
			if(a.charAt(i)!=a.charAt(i+1))
			{
				output += num +"" + letter;
				counter = 1;
			}
				
		}
		return output;
	}
	//public String runLength(String b, String c) {
	//
	//}
	public static void main(String[] args)
	{
		highSchool tester = new highSchool();
		String testOne = tester.runLength("AAAAABBBBB");
		System.out.println(testOne);
		String testTwo = tester.runLength("SSSSSSSS");
		System.out.println(testTwo);
	}
}