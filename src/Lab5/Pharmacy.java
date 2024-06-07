package Lab5;

import java.util.LinkedList;
//Omnia Osama Ahmed 1084505

public class Pharmacy {

private String Name, Address, Phone, OpeningHours;
private LinkedList<Medicine> StoredMedicines;

public Pharmacy(String name, String address, String phone, String openingHours) {
    this.Name = name;
    this.Address = address;
    this.Phone = phone;
    this.OpeningHours = openingHours;
    this.StoredMedicines = new LinkedList<Medicine>();

}

public String getName() { return Name;}
public void setName(String name) { Name = name;}
public String getAddress() { return Address;}
public void setAddress(String address) { Address = address;}
public String getPhone() { return Phone;}
public void setPhone(String phone) { this.Phone = phone;}
public String getOpeningHours() { return OpeningHours;}
public void setOpeningHours(String openingHours) { OpeningHours = openingHours;}
public LinkedList<Medicine> getStoredMedicines() { return StoredMedicines;}
public int getNumberOfStoredMedicines() { return StoredMedicines.size();}
public void setstoredMedicines(LinkedList<Medicine> storedMedicines) {StoredMedicines = storedMedicines;}

public void addMedicine(Medicine medicine) { // adds a new medicine to the store. If exists already, it updates the quantity.
    boolean updated = false;

    for (int i = 0; i < StoredMedicines.size() && !updated; i++) {
        Medicine md = StoredMedicines.get(i);

        if (md.getName().equals(medicine.getName())) // Medicine exists and we need just to update the quantity
        {
            md.updateQuantity(medicine.getQuantity());
            updated = true;
        }
    }


    if (!updated) { // Medicine is not stored, and we need to add it to ythe store
        StoredMedicines.add(medicine);
    }
}

public void showStoredMedicines()
{
    String header = String.format(" %15s %20s %20s %40s  %10s", "Name", "Manufacturer", "Description", "HowToApply", "Quantity");
    System.out.println(header);
    for (Medicine md : StoredMedicines)
    System.out.println(md);
}

public Medicine searchMedicine(String name)
{
    for (Medicine md : StoredMedicines)
    {
        if (md.getName().equalsIgnoreCase(name))
            return md;
    }
return null;
}

public boolean RemoveMedicine(String name) {
    for (Medicine md : StoredMedicines)
    {
        if (md.getName().equals(name))
        {
            StoredMedicines.remove(md);
            return true;
        }
    }
return false;
}

@Override
public String toString()
{
return String.format("[%20s %15s %10s %10s]", Name, Address, Phone , OpeningHours);
}

}

