public class Car {
    // Fields (Attributes)
    String model;
    String color;
    int speed;

    // Constructor: This is used to create an object of the Car class
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Methods (Behaviors)
    public void start() {
        System.out.println(model + " is starting.");
    }

    public void stop() {
        System.out.println(model + " is stopping.");
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(model + " is accelerating to " + speed + " mph.");
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed);
    }
}
