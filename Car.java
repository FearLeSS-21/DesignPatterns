class Car {
    private int seats;
    private String engine;
    private String tripComputer;
    private String gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(String gps) {
        this.gps = gps;
    }

    public String toString() {
        return "Car " + " seats " + seats + " engine " + engine + " " + " tripComputer='" + tripComputer + "" + " Gps='" + gps + " ";
    }
}