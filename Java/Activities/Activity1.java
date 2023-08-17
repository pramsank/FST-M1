package src.Activities;

public class Activity1 {
    public static void main(String[] args) {
        //create object of the class Car
        Car honda = new Car();
        //Initialize values
        honda.make = 2014;
        honda.color = "Black";
        String transmission = "Manual";
        //using Car class method
        honda.displayCharacterstics();
        honda.accelerate();
        honda.brake();
    }



}
