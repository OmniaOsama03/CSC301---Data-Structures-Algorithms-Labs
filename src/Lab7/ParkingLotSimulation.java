package Lab7;
//Omnia Osama Ahmed - 1084505

public class ParkingLotSimulation
{
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(4);

        Vehicle car1 = new Vehicle("ABC123", 7, 9);
        Vehicle car2 = new Vehicle("XYZ789");
        Vehicle car3 = new Vehicle("123456");
        Vehicle car4 = new Vehicle("67JDGT9");
        Vehicle car5 = new Vehicle("OMN1A");

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(car3);
        parkingLot.parkVehicle(car4);
        parkingLot.parkVehicle(car5);

        Vehicle exitedCar = parkingLot.exitParking();

        if (exitedCar != null) {
            System.out.println("Exited vehicle: " + exitedCar.getLicensePlate());
        }

        System.out.println("Available parking spaces: " + parkingLot.getAvailableSpaces());



    }
}

