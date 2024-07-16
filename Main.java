public class Main {
    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();

        builder.setSeats(4);
        builder.setEngine("V8");
        builder.setTripComputer("Advanced");
        builder.setGPS("GPS Pro");

        Car car = builder.getCar();
        System.out.println(car);

    }
}
