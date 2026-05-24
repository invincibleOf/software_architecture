package co.edu.upb.patrones.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Car basicCar = new Car.CarBuilder( "ABC001", "FORD", 0, Transmission.MANUAL, Fuel.GAS, 123000).build();
        Car moreComponentsCar = new Car.CarBuilder( "DEF999", "MAZDA", 1000, Transmission.AUTOMATIC, Fuel.ELECTRIC, 113000)
                .withGPS()
                .withSunroof()
                .withParkingCamera()
                .build();

        System.out.println(basicCar.toString());
        System.out.println(moreComponentsCar.toString());
    }
}
