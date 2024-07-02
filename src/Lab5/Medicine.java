package Lab5;
public class Medicine
{

    private String Name, Manufacturer, Description, HowToApply;
    private int Quantity;

    public Medicine(String name, String manufacturer, String description, String howToApply, int quantity) {
        this.Name = name;
        this.Manufacturer = manufacturer;
        this.Description = description;
        this.HowToApply = howToApply;
        this.Quantity = quantity;
    }

    public String getName() { return Name;}
    public void setName(String name) { Name = name;}
    public String getManufacturer() { return Manufacturer;}
    public void setManufacturer(String manufacturer) { Manufacturer = manufacturer;}
    public String getDescription() { return Description;}
    public void setDescription(String description) { Description = description;}
    public String getHowToApply() { return HowToApply;}
    public void setHowToApply(String howToApply) { HowToApply = howToApply;}
    public int getQuantity() { return Quantity;}
    public void setQuantity(int quantity) { Quantity = quantity;}
    public void updateQuantity(int newQuantity) { Quantity += newQuantity;}

    @Override
    public String toString() {
        return String.format("[%15s %20s %20s %40s %10d]", Name, Manufacturer, Description, HowToApply, Quantity);
    }
}

