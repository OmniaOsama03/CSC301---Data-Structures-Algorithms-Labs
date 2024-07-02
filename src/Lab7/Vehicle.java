package Lab7;

class Vehicle {
    private String licensePlate;
    private double timeEntered;
    private double timeExited;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Vehicle(String licensePlate, double timeEntered, double timeExited) {
        this.licensePlate = licensePlate;
        this.timeEntered = timeEntered;
        this.timeExited = timeExited;
    }

    public double getTimeEntered()
    {
        return timeEntered;
    }

    public double getTimeExited() {
        return timeExited;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

