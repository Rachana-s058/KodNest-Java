
class Car {

    static void convertKMintoMiles() {
        System.out.println("Converting KM into Miles...");
    }

    void calculateMileage() {
        System.out.println("Calculating Mileage...");
    }

    public static void main(String[] args) {
        Car.convertKMintoMiles();
        Car nano = new Car();
        nano.calculateMileage();

        Car bmw = new Car();

        bmw.calculateMileage();
    }
}
