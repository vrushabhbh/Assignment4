package assignment_4;

public class TestCar {

	public static void main(String[] args) {

  
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        
        car1.setCarDetails("Sedan", "Honda Civic", 25000, "John Doe");
        car2.setCarDetails("SUV", "Toyota Highlander", 35000, "Jane Smith");
        car3.setCarDetails("Hatchback", "Hyundai i20", 18000, "Alice Brown");
        
        System.out.println("Details of Car 1:");
        car1.displayCarDetails();

        System.out.println("Details of Car 2:");
        car2.displayCarDetails();

        System.out.println("Details of Car 3:");
        car3.displayCarDetails();
    }


	}


