package Lab4;

import java.util.*;

public class testLinkedList_T3 {
    public static void main(String[] args)
    {
        LinkedList<Stock> stocksHistory4505 = new LinkedList<>();
        try
        {
            readData("MarketHistory.txt", stocksHistory4505);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Number of history items: "	+ stocksHistory4505.size());
        System.out.println("500th trading history:"	+ stocksHistory4505.get(499) );

        System.out.println("History Content:");
        for (Iterator<Stock> history = stocksHistory4505.iterator() ; history.hasNext();)
            System.out.print(history.next());

        System.out.println("Testing Sorting based on COMPANY NAME");
        Collections.sort(stocksHistory4505);
        for (Stock sh : stocksHistory4505)
            System.out.print(sh);

        System.out.println("Testing Sorting based on COMPANY NAME and ADJClose PRICE");
        ADJCloseComparator priceComparator = new ADJCloseComparator();
        Collections.sort(stocksHistory4505, priceComparator);
        System.out.println(stocksHistory4505);

        System.out.println("Testing Extracting SubCollection based on SYMBOL");
        LinkedList<Stock> shADIB = new LinkedList<Stock>();
        for (Stock sh : stocksHistory4505)
            if (sh.Symbol05.equals("ADIB"))
                shADIB.add(sh);
        System.out.println(shADIB);
        System.out.println("ADIB History: number of entries = " + shADIB.size());
        System.out.println("            : MAX ADJClose price = " + Collections.max(shADIB));
        System.out.println("            : MIN ADJClose price = " + Collections.min(shADIB));

        System.out.println("Practice1: Create a new list containing all companies' Symbol:");
        LinkedList<String> allSymbols_1084505 = new LinkedList<>();

        for(Stock ss: stocksHistory4505)
        {
            if( !allSymbols_1084505.contains(ss.Symbol05))
            {
                allSymbols_1084505.add(ss.Symbol05);
            }
        }

        System.out.println("Practice2: Create a separate list containing all companies with a number of trades >=40:");

        LinkedList<String> allLarger40_1084505 = new LinkedList<>();

        for(Stock ss: stocksHistory4505 )
        {
            if( ss.TradeCount05 >= 40)
            {
                allLarger40_1084505.add(ss.CompanyName05);
            }
        }


    }

    public static void readData(String fileName, List <Stock> stocksHistory)
            throws Exception {
        java.io.File file = new java.io.File(fileName);
        Scanner input = new Scanner(file);
        input.nextLine(); //Discard 1st line
        while (input.hasNext()) {
            Scanner in = new Scanner(input.nextLine());
            in.useDelimiter("\t");
            float ADJClose = in.nextFloat();
            float Change = in.nextFloat();
            float Close	= in.nextFloat();
            String CompanyName = in.next();
            String Date = in.next();
            float High = in.nextFloat();
            int ID = in.nextInt();
            float LastTradePrice	= in.nextFloat();
            float Low = in.nextFloat();
            float Open = in.nextFloat();
            float PercentageChange	= in.nextFloat();
            float PreviousClose	= in.nextFloat();
            String Sector = in.next();
            String Symbol = in.next();
            int TradeCount = in.nextInt();
            float Value	= in.nextFloat();
            int Volume = in.nextInt();
            stocksHistory.add(new Stock(ADJClose, Change, Close, High, LastTradePrice,
                    Low, Open, PercentageChange, PreviousClose, Value, CompanyName,
                    Date, Sector, Symbol, ID, TradeCount, Volume));
        }
        input.close();
    }
}

