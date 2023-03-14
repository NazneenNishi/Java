
public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota","Corola",2010);
		//Car car2 = new Car("Maruti","Rocks",2020);
		Car car2 = new Car(car1);
		
		//car2 = car1;
		//car2.copy(car1);
	
		
		System.out.println(car1);
		System.out.println(car2);
	
		
		System.out.println();
		
		
		System.out.println(car1.getmake());
		System.out.println(car1.getmodel());
		System.out.println(car1.getyear());
		
		
		System.out.println();
		
		
		System.out.println(car2.getmake());
		System.out.println(car2.getmodel());
		System.out.println(car2.getyear());
		
		
	}
	
}