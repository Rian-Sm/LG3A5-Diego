package atividade5;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "baeldung";
		 String nullName = null;
		
	    Optional<String> opt1 = Optional.of(name);

	    Optional<String> opt2 = Optional.ofNullable(name);
	    
	    String opt3 = Optional.ofNullable(nullName).orElse("john");
	    
	    String opt4 = Optional.ofNullable(nullName).orElseGet(() -> "john");
	    
	    String opt5 = Optional.ofNullable(nullName).orElseThrow(
	    	      IllegalArgumentException::new);

		
	}

}
