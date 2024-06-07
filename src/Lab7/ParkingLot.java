package Lab7;

import java.util.LinkedList;
import java.util.Queue;
//Omnia Osama Ahmed
class ParkingLot {
    private Queue<Vehicle> parkingQueue;
    private int capacity;

    private double FeePerHour = 3.5;
    public ParkingLot(int capacity) {
        parkingQueue = new LinkedList<Vehicle>();
        this.capacity = capacity;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (isFull())
        {
            System.out.println("Parking lot is full. Cannot park " + vehicle.getLicensePlate());
            return false;
        }
        parkingQueue.add(vehicle);
        System.out.println("Parked: " + vehicle.getLicensePlate());
        return true;
    }

    public Vehicle exitParking()
    {
        if (isEmpty()) {
            System.out.println("Parking lot is empty. No vehicles to exit");
            return null;
        }
		Vehicle exitedVehicle = parkingQueue.poll();
        System.out.println("Exited: " + exitedVehicle.getLicensePlate());
        System.out.println(calculateParkingFee(exitedVehicle));
        return exitedVehicle;
    }

    public boolean isFull() {
        return parkingQueue.size() >= capacity;
    }

    public boolean isEmpty() {
        return parkingQueue.isEmpty();
    }

    public int getAvailableSpaces() {
        return capacity - parkingQueue.size();
    }


    public String calculateParkingFee(Vehicle vehicle)
    {

        double Fee =  (vehicle.getTimeExited() - vehicle.getTimeEntered()) * 3.5;

        return "Total Parking Fee: " + Fee;
    }
}

