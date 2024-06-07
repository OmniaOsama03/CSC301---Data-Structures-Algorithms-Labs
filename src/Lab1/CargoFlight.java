package Lab1;
//Omnia Osama Ahmed- 1084505
public class CargoFlight extends FlightInfo      //This class is for Cargo flights in particular.
{
    private int flightNumber;
    private String cargoType;

    //Constructor:
    CargoFlight(String pilotName, int passengerCount, String destination, int hoursOfFlight, int flightNumber, String cargoType)
    {
        super(pilotName, passengerCount, destination, hoursOfFlight);

        this.flightNumber = flightNumber;
        this.cargoType = cargoType;
    }

    //setters:
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public void setCargoType(String cargoType)
    {
        this.cargoType = cargoType;
    }

    //Getters:
    public int getFlightNumber()
    {
        return flightNumber;
    }

    public String getCargoType()
    {
        return cargoType;
    }

    //toString method:

    public String toString()
    {

        return super.toString() + "\n Flight Number: " + flightNumber + "\n Type of Cargo: " + cargoType;
    }

    public void displayGateNumber() //Message displayed is personalized to cargo flights.
    {
            if(super.getDestination().equalsIgnoreCase("France") || super.getDestination().equalsIgnoreCase("UK"))
                System.out.println("This " + cargoType + " cargo flight departures from gate 12.");

            else if(super.getDestination().equalsIgnoreCase("America") || super.getDestination().equalsIgnoreCase("Canada"))
                System.out.println("This " + cargoType + " cargo flight departures from gate 23.");

            if(super.getDestination().equalsIgnoreCase("Italy") || super.getDestination().equalsIgnoreCase("Greece"))
                System.out.println("This " + cargoType + " cargo flight departures from gate 06.");

            else if(super.getDestination().equalsIgnoreCase("Germany") || super.getDestination().equalsIgnoreCase("Russia"))
                System.out.println("This " + cargoType + " cargo flight departures from gate 17.");
    }
}
