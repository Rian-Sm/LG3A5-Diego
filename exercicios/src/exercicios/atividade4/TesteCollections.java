package exercicios.atividade4;

import java.util.stream.Collectors;

public class TesteCollections {
	
	public static void main(String[] args) {
		int temperatura = 20;

			
		   System.out.println(Cidades.prepareTemperature().stream()
	                 .filter(f -> f.getTemperature() > temperatura)
	                 .map(f -> f.getName())
	                 .collect(Collectors.toList())); 
		   
		   System.out.println(Cidades.prepareTemperature().stream().filter(f -> f.getTemperature() > temperatura).count());
	                  
	    } 
}
