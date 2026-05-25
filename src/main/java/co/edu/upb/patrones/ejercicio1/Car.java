package co.edu.upb.patrones.ejercicio1;

public class Car {
    private final String placa;
    private final String brand;
    private final int mileage;
    private final Transmission transmission;
    private final Fuel fuel;
    private final double price;

    private final String engine;
    private final String color;
    private final String tiresBrand;
    private final String soundSystem;
    private final String interior;
    private final boolean sunroof;
    private final boolean gps;
    private final boolean parkingCamera;

    public Car(CarBuilder carBuilder) {
        this.placa = carBuilder.placa;
        this.brand = carBuilder.brand;
        this.mileage = carBuilder.mileage;
        this.transmission = carBuilder.transmission;
        this.fuel = carBuilder.fuel;
        this.price = carBuilder.price;
        this.engine = carBuilder.engine;
        this.color = carBuilder.color;
        this.tiresBrand = carBuilder.tiresBrand;
        this.soundSystem = carBuilder.soundSystem;
        this.interior = carBuilder.interior;
        this.sunroof = carBuilder.sunroof;
        this.gps = carBuilder.gps;
        this.parkingCamera = carBuilder.parkingCamera;
    }

    public static class CarBuilder {
        private String placa;
        private String brand;
        private int mileage;
        private Transmission transmission;
        private Fuel fuel;
        private double price;

        private String engine = "1.5";
        private String color = "red";
        private String tiresBrand = "Michelin";
        private String soundSystem = "Speakers";
        private String interior = "Leather";
        private boolean sunroof = false;
        private boolean gps = false;
        private boolean parkingCamera = false;

        public CarBuilder(String placa, String brand, int mileage, Transmission transmission, Fuel fuel, double price) {
            this.placa = placa;
            this.brand = brand;
            this.mileage = mileage;
            this.transmission = transmission;
            this.fuel = fuel;
            this.price = price + transmission.getPrice() + fuel.getPrice();
        }

        public CarBuilder setupEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setupColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setupTiresBrand(String tiresBrand) {
            this.tiresBrand = tiresBrand;
            return this;
        }

        public CarBuilder setupSoundSystem(String soundSystem) {
            this.soundSystem = soundSystem;
            return this;
        }

        public CarBuilder setupInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public CarBuilder withSunroof() {
            this.sunroof = true;
            return this;
        }

        public  CarBuilder withGPS() {
            this.gps = true;
            return this;
        }

        public CarBuilder withParkingCamera() {
            this.parkingCamera = true;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
    private String getExtraDetailString() {
        String detail = new String();

        if (!this.engine.isEmpty()) {
            detail += ("engine='" + this.engine + '\'' + "\n");
        }

        if (!this.color.isEmpty()) {
            detail += ("color='" + this.color + '\'' + "\n");
        }

        if (!this.tiresBrand.isEmpty()) {
            detail += ("tiresBrand='" + this.tiresBrand + '\'' + "\n");
        }

        if (!this.soundSystem.isEmpty()) {
            detail += ("soundSystem='" + this.soundSystem + '\'' + "\n");
        }

        if (!this.interior.isEmpty()) {
            detail += ("interior='" + this.interior + '\'' + "\n");
        }

        if (this.sunroof) {
            detail += ("withSunroof='Added'" + "\n");
        }

        if (this.gps) {
            detail += ("withGPS='Added'" + "\n");
        }

        if (this.parkingCamera) {
            detail += ("withParkingCamera='Added'" + "\n");
        }

        return detail;
    }


    @Override
    public String toString() {
        String baseDetail = "CAR BASIC INFO: [\n" +
                "placa='" + placa + '\'' + "\n" +
                "brand='" + brand + '\'' + "\n" +
                "mileage='" + mileage + '\'' + "\n" +
                "transmission='" + transmission + '\'' + "\n" +
                "fuel='" + fuel + '\'' + "\n" +
                "price='" + price + '\'' + "\n" +
                "]\n";

        String extraDetail = getExtraDetailString();
        if (!extraDetail.isEmpty()) {
            baseDetail += ("CAR EXTRA INFO [" + extraDetail + "]\n\n");

        }
        return baseDetail;
    }
}
