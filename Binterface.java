public interface Binterface {
    void reset();

    void setSeats(int number);

    void setEngine(String engineType);

    void setTripComputer(String computerType);

    void setGPS(String gpsType);
}

class CarBuilder implements  Binterface {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(String engineType) {
        this.car.setEngine(engineType);
    }

    @Override
    public void setTripComputer(String computerType) {
        this.car.setTripComputer(computerType);
    }

    @Override
    public void setGPS(String gpsType) {
        this.car.setGPS(gpsType);
    }

    public Car getCar() {
        Car builtCar = this.car;
        this.reset();
        return builtCar;
    }
}

class CarManual implements  Binterface {
    private CarManual carManual;

    public CarManual() {
        this.reset();
    }

    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        this.carManual.setSeats(number);
    }

    @Override
    public void setEngine(String engineType) {
        this.carManual.setEngine(engineType);
    }

    @Override
    public void setTripComputer(String computerType) {
        this.carManual.setTripComputer(computerType);
    }

    @Override
    public void setGPS(String gpsType) {
        this.carManual.setGPS(gpsType);
    }

}



