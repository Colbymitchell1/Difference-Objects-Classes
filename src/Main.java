public class Main {
    public static void main(String[] args) {
        // Object creation: This is an instance of the Car class
        Car myCar = new Car("Toyota", "Red", 60);

        // Using the object to call methods
        myCar.displayDetails();  // Display the details of myCar object
        myCar.start();           // Start the car
        myCar.accelerate(20);    // Accelerate the car
        myCar.stop();            // Stop the car

        // Creating another object of the Car class
        Car anotherCar = new Car("Honda", "Blue", 50);
        anotherCar.displayDetails();
        anotherCar.start();
        anotherCar.accelerate(30);
        anotherCar.stop();
    }
}
