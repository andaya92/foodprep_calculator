package lifeStyleFoodPrep;

public class Meal {

	private String name;
	private int meat;
	private int side;
	private int veggies;
	
	
	private int sunflower;
	private int cheese;
	private double spinach;
	private double lettuce;
	
	private int beans;
	private int onion;

	
	//Meat, Side, Veggie
	public Meal(String n,int m, int s, int v){
		
		name = n;//chickenBRiceLG
		meat = m;//114g
		side = s;//250g
		veggies = v;//45g
		
	}
	
	//Meat, Side, Pepper, onion, 
	public Meal(String n, int m, int s, int p, int o){
		name = n;
		meat = m;
		side =s;
		veggies = p;
		onion = o;
	}
	
	
	public Meal(String n,int m, int al, int sun, int che,double spin, double lett){
		name = n;
		meat = m;
		side = al;
		sunflower = sun;
		cheese = che;
		spinach = spin;
		lettuce = lett;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMeat(){
		return meat;
	}
	public int getSide(){
		return side;
	}
	public int getVeggies(){
		return veggies;
	}
	public double getLettuce(){
		return lettuce;
	}
	public double getSpinach(){
		return spinach;
	}
	public int getCheese(){
		return cheese;
	}
	public int getSunflower(){
		return sunflower;
	}
	public int getOnion(){
		return onion;
	}
	
	
}
