package Lab5;
//Omnia Osama Ahmed 1084505

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

//Omnia Osama Ahmed 1084505
public class Test {
    static LinkedList<Pharmacy> Pharmacies = new LinkedList<Pharmacy>();

    public static void main(String[] args) {

        initializePharmacies();
        showPharmacies();

        System.out.println("\n-----------Task 1: Show all pharmacies that are in my city, e.g. Khalifa City-----------------------------------------");
        // Task1: Show all pharmacies that are in my city, e.g. Khalifa City
        for (Pharmacy ph : Pharmacies) {
            if (ph.getAddress().equalsIgnoreCase("Khalifa City"))
            System.out.println(ph);

        }

        System.out.println("\n-----------Task 2: Show all pharmacies that have a particular medicine available, e.g. Panadol -----------------------------------------");
        // Task2: Begin the search from the end of the list

        ListIterator<Pharmacy> iterator = Pharmacies.listIterator(Pharmacies.size()); // Start from the end

        while (iterator.hasPrevious()) {
			Pharmacy ph = iterator.previous();

            if (ph.searchMedicine("Panadol") != null)
            {
                System.out.println(ph);
            }
        }


        System.out.println("\n-----------Task 3: One of Burjeel Pharmacy's pharmacies closed in Khalifa City-----------------------------------------");
        // Task3: One of Burjeel Pharmacy's pharmacies closed in "Khalifa City". Complete partial code below to implement that.
        boolean Done = false;
        for (int i=0; i < Pharmacies.size() && !Done; i++) {
            Pharmacy ph = Pharmacies.get(i);
            if(ph.getName().equals("Burjeel Pharmacy") && ph.getAddress().equalsIgnoreCase("Khalifa City")) {
                Pharmacies.remove(ph);
                Done = true;
            }
        }
        showPharmacies();

System.out.println("\n-----------Task 4: Two pharmacies merged in one location-----------------------------------------");
// Task4: Two pharmacies merged in one location. Do necessary actions.
// example Modern and Almanara Khalifa City's pharmacies merged
// add all medicine stored in Modern pharmacy will be transferred to Al manara pharmacy

//find the indices both pharmacies in the list.
int ph1Index = -1, ph2Index = -1;
for (int i = 0; i < Pharmacies.size(); i++)
{
    Pharmacy ph = Pharmacies.get(i);

    if(ph.getName().equalsIgnoreCase("Modern Pharmacy") && ph.getAddress().equalsIgnoreCase("Khalifa City"))
        ph1Index = i;
    else if (ph.getName().equalsIgnoreCase("Al manara Pharmacy") && ph.getAddress().equalsIgnoreCase("Khalifa City"))
        ph2Index = i;
}

if (ph1Index > 0 && ph2Index>0)
{ // That is, we have found the two pharmacies
    Pharmacy ModernaPharmacy = Pharmacies.get(ph1Index);
    Pharmacy AlmanaraPharmacy = Pharmacies.get(ph2Index);

    for (Medicine md : ModernaPharmacy.getStoredMedicines()) {
        AlmanaraPharmacy.addMedicine(md);
    }

    Pharmacies.remove(ModernaPharmacy); // delete Moderna pharmacy
    AlmanaraPharmacy.showStoredMedicines();
    showPharmacies();
}

    }

    public static void initializePharmacies() {
        // Initialize Pharmacies
        Pharmacies.add(new Pharmacy("Burjeel Pharmacy", "Khalifa City", "026453627", "8am-10pm"));
        Pharmacies.add(new Pharmacy("Burjeel Pharmacy", "Al Markaziyah", "026423457", "8am-10pm"));
        Pharmacies.add(new Pharmacy("Al Manara Pharmacy", "Madinat Zayed", "026314523", "8am-10pm"));
        Pharmacies.add(new Pharmacy("Al Manara Pharmacy", "Khalifa City", "026314615", "8am-10pm"));
        Pharmacies.add(new Pharmacy("Modern Pharmacy", "Khalifa City", "026323415", "8am-10pm"));
        Pharmacies.add(new Pharmacy("Royal Orchid", "Al Reem Island", "026457617", "8am-10pm"));

        Pharmacies.add(new Pharmacy("Omnia's Pharmacy", "Home", "1084505", "Always :D"));

        for(Pharmacy ph : Pharmacies) //To add the medicine to my pharmacy
        {
            if(ph.getName().equalsIgnoreCase("Omnia's Pharmacy"))
            {
                ph.addMedicine(new Medicine("Omnia's", "no", "Finger hurty", "no", 9));
            }
        }

        // add 3 medicines to each Pharmacy
        for (int i = 0; i < 4; i++) {
            if(Pharmacies.get(i).getName().equalsIgnoreCase("Omnia's Pharmacy")) //To not add the other medicines
            {
                continue;
            }
            Pharmacies.get(i).addMedicine( new Medicine("Panadol", "GlaxoSmithKlines", "Common flu", "Take a tablet morning and night", 20));
            Pharmacies.get(i).addMedicine(new Medicine("SlowFe", "GlaxoSmithKline", "Iron Deficiency", "Consume Once a day", 25));
            Pharmacies.get(i).addMedicine(new Medicine("Ultra Vitamin D", "Vitabiotics", "Vitamin D Deficiency", "Consume once a month", 15));
        }

        for (int i = 4; i < 6; i++) {
            if(Pharmacies.get(i).getName().equalsIgnoreCase("Omnia's Pharmacy"))
            {
                continue;
            }
            Pharmacies.get(i).addMedicine(new Medicine("Calcium", "Nature's Bounty", "Calcium Deficiency", "Take a tablet after breakfast everyday", 40));
            Pharmacies.get(i).addMedicine(new Medicine("Claritin", "Schering-Plough", "Allergy", "Consume twice a day", 25));
            Pharmacies.get(i).addMedicine(new Medicine("Joint Care", "IndiaMart", "Joint pain", "Consume once daily", 50));

        }
    }

    private static void showPharmacies() {
        System.out.println("All pharmacies are-----------------------------------------");
        for (Pharmacy ph : Pharmacies)
        System.out.println(ph);
    }

}