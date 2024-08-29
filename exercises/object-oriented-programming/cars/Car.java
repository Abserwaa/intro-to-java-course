import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    //constructor that accepts parameters representing the make, model, colour and year of the car
    public Car(String make, String model, String colour, int year)
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.year = year;
}

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Method to get details
    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Colour: " + colour;
    }

public class Showroom {
    public List<Car> getCars() {
    List<Car> cars = new ArrayList<>();
    
    cars.add(new Car("Volvo", "V40", 2012, "Blue"));
    cars.add(new Car("Porsche", "Panamera", 2009, "Red"));
    cars.add(new Car("Audi", "A3", 2018, "Grey"));
    
    return cars;
}
}
public class App {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        List<Car> cars = showroom.getCars();

        for (Car car : cars) {
            System.out.println(car.getDetails());
        }
    }
}

