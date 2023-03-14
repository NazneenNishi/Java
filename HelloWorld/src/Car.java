
public class Car{
	
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	Car(Car x){
		
		this.copy(x);
		
	}
	
	public String getmake() {
		
		return make;
		
	}
	
	public String getmodel() {
		
		return model;
		
	}
	
	public int getyear() {
		
		return year;
		
	}
	
	public void setmake(String make) {
		
		this.make = make;
		
	}

	public void setmodel(String model) {
		
		this.model = model;
		
	}
	
	public void setyear(int year) {
	
		this.year = year;
	
	}

	
	public void copy(Car x) {
		
		this.setmake(x.getmake());
		this.setmodel(x.getmodel());
		this.setyear(x.getyear());
		
	}
	
	
	
	
	
	
}
