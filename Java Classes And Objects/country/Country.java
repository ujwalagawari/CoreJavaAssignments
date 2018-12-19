package assignment.country;

/**
 * @author ugawari
 *
 */
public class Country {

	private String name;
	private long population;
	private double area;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public Country(String name, long population, double area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	public Country() {
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population
				+ ", area=" + area + "]";
	}
	
	
	/**
	 * To check largest Area Country
	 * @param countries- array of country
	 * @return
	 */
	public Country largestAreaCountry(Country[] countries){
		for(int size=0; size<countries.length-1; size++){
			Country country=null;
			if(countries[size].getArea()>countries[size+1].getArea()){//changes array in ascending order based on area of country
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
	
	/**
	 * To check largest Population Country
	 * @param countries- array of country
	 * @return
	 */
	public Country largestPopulationCountry(Country[] countries){
		for(int size=0; size<countries.length-1; size++){
			Country country=null;
			if(countries[size].getPopulation()>countries[size+1].getPopulation()){//changes array in ascending order based on population of country
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
	
	/**
	 * To check largest Population Density Country
	 * @param countries- array of country
	 * @return
	 */
	public Country largestPopulationDensityCountry(Country[] countries){
		for(int size=0; size<countries.length-1; size++){
			Country country=null;
			if((countries[size].getPopulation()/countries[size].getArea()) > 
					(countries[size+1].getPopulation()/countries[size+1].getArea())){//changes array in ascending order based on population density of country
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
	
}
