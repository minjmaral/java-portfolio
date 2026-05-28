class Car {
    private String make;
    private String model;
    private int year;
    private double fuelConsumption;
    private String engineType;

    public Car(String make, String model, int year, double fuelConsumption, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
        this.engineType = engineType;
    }

    public void displayInfo() {
        System.out.println(make + " " + model + " (" + year + ") - ");
        System.out.println("Fuel: " + fuelConsumption + " L/100km, Engine: " + engineType);
    }

    public boolean isFuelEfficient() {
        return fuelConsumption < 5.0;
    }
}