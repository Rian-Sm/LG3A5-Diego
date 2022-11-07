package exercicios.atividade4;

import java.util.ArrayList;
import java.util.List;

public class Cidades {

 private String name;
 private double temperature;

 public Cidades(String name, double temperature)
 {
     this.name = name;
     this.temperature = temperature;
 }
 
 public static List<Cidades> prepareTemperature()
	{
	    List<Cidades> cities = new ArrayList<>();
	    cities.add(new Cidades("New Delhi", 33.5));
	    cities.add(new Cidades("Mexico", 14));
	    cities.add(new Cidades("New York", 13));
	    cities.add(new Cidades("Dubai", 43));
	    cities.add(new Cidades("London", 15));
	    cities.add(new Cidades("Alaska", 1));
	    cities.add(new Cidades("Kolkata", 30));
	    cities.add(new Cidades("Sydney", 11));
	    cities.add(new Cidades("Mexico", 14));
	    cities.add(new Cidades("Dubai", 43));
	    return cities;
	}


 public String getName()
 {
     return name;
 }

 public Double getTemperature()
 {
     return temperature;
 }
 

 @Override
 public String toString()
 {
     return name + " --> " + temperature;
 }
}
