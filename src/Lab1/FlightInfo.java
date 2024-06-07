package Lab1;
//Omnia Osama Ahmed - 1084505
public class FlightInfo                        //Abu Dhabi Airport- flight information
{
    //The datafields:
    private String pilotName;
    private int passengerCount;
    private String destination;
    private int hoursOfFlight;

    //The constructors:
    FlightInfo(){};
    FlightInfo(String pilotName, int passengerCount, String destination, int hoursOfFlight)
    {
        this.pilotName = pilotName;
        this.passengerCount= passengerCount;
        this.destination = destination;
        this.hoursOfFlight = hoursOfFlight;
    }

    //setters:
    public void setPilotName(String pilotName)
    {
        this.pilotName = pilotName;
    }

    public void setPassengerCount(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setHoursOfFlight(int hoursOfFlight)
    {
        this.hoursOfFlight = hoursOfFlight;
    }

    //Getters:
    public String getPilotName()
    {
        return pilotName;
    }

    public int getPassengerCount()
    {
        return passengerCount;
    }

    public String getDestination()
    {
        return destination;
    }

    public int getHoursOfFlight()
    {
        return hoursOfFlight;
    }

    //toString method:
    public String toString()
    {
        return "\n Pilot's Name: " + pilotName + "\n Num of Passengers: " + passengerCount + "\n Destination: " + destination + "\n Flight Duration (hrs):" + hoursOfFlight ;
    }

    public void displayGateNumber() //Sets gate number based on destination.
    {
        if(destination.equalsIgnoreCase("France") || destination.equalsIgnoreCase("UK"))
            System.out.println("This flight departures from gate 12.");

        else if(destination.equalsIgnoreCase("America") || destination.equalsIgnoreCase("Canada"))
            System.out.println("This flight departures from gate 23.");

        if(destination.equalsIgnoreCase("Italy") || destination.equalsIgnoreCase("Greece"))
            System.out.println("This flight departures from gate 06.");

        else if(destination.equalsIgnoreCase("Germany") || destination.equalsIgnoreCase("Russia"))
            System.out.println("This flight departures from gate 17.");
    }

    public void checkFlightCapacity()
    {
        System.out.println("This flight holds 100 people, and it currently has " + passengerCount + " people. ");
    }
}
