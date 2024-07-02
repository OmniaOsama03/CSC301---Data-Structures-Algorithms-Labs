package Lab1;
public class Test
{
    public static void main(String[] args) {

        //3 Objects: One of the parent, one of the child, one of the child in the form of the parent (Polymorphism)

        FlightInfo flight1 = new FlightInfo("Omnia Ahmed", 28, "Italy", 7);
        CargoFlight flight2 = new CargoFlight("Fatma Walid", 50, "America", 13, 9933, "Airbus Beluga");
        FlightInfo flight3 = new CargoFlight("Tuti toots", 99, "UK", 5, 5832, "Boeing 737");

        //Displaying the info:
        System.out.println(flight1.toString());
        System.out.println(flight2.toString());
        System.out.println(flight3.toString());


        //Running the void method:
        flight1.displayGateNumber();
        flight2.displayGateNumber();
        flight3.displayGateNumber();

        //Whether each object is an instance of FlightInfo or CargoFlight:
        System.out.println(flight1 instanceof FlightInfo);
        System.out.println(flight2 instanceof FlightInfo);
        System.out.println(flight3 instanceof FlightInfo);
        System.out.println(flight1 instanceof CargoFlight);
        System.out.println(flight2 instanceof CargoFlight);
        System.out.println(flight3 instanceof CargoFlight);

        //Calling a parent method through a child object:
        flight3.checkFlightCapacity();
    }
}
