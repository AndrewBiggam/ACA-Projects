class highSchool{

	public String runLength(String a) {
	
	String output;
	int counter = 1;
	
	
	for (int i = 0; i < a.length(); i++){
        
		 if(a.charAt(i)==a.charAt(i)+1){
				 counter += counter;
		}
		
		
		if(a.charAt(i)!=a.charAt(i)+1){
			
			String num = Integer.toString(counter);
			(num + a.charAt(i))+=output;
			counter = 1;
		}
		return output;
	}
	
	public String runLength(String, String) {
	
	}
}