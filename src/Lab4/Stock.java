package Lab4;
//Omnia Osama Ahmed- 1084505
public class Stock implements Comparable<Stock>
{
        float ADJClose05, Change05, Close05, High05, LastTradePrice05, Low05, Open05, PercentageChange05,
        PreviousClose05, Value05;
        String CompanyName05, Date05, Sector05, Symbol05;
        int ID05, TradeCount05, Volume05;

        Stock(float ADJClose, float Change, float Close, float High, float LastTradePrice,
        float Low, float Open, float PercentageChange,
        float PreviousClose, float Value, String CompanyName, String Date,
        String Sector, String Symbol, int ID, int TradeCount, int Volume)
        {
        this.ADJClose05 = ADJClose;
        this.Change05 = Change;
        this.Close05 = Close;
        this.High05 = High;
        this.LastTradePrice05 = LastTradePrice;
        this.Low05 = Low;
        this.Open05 = Open;
        this.PercentageChange05 = PercentageChange;
        this.PreviousClose05 = PreviousClose;
        this.Value05 = Value;
        this.CompanyName05 = CompanyName;
        this.Date05 = Date;
        this.Sector05 = Sector;
        this.Symbol05 = Symbol;
        this.ID05 = ID;
        this.TradeCount05 = TradeCount;
        this.Volume05 = Volume;
        }

public String toString ()
{
        //Returns a tab-separated string containing the main fields
        return  "\n" + ID05 + "\t" + Low05 + "\t" + Open05 + "\t" + Symbol05 + "\t" +
        TradeCount05 +  "\t" + Volume05;

        }

public String toStringFull ()
{
        //Returns a tab-separated string containing all fields
        return ADJClose05 + "\t" + Change05 + "\t" + Close05 + "\t" + CompanyName05 + "\t" +
        Date05 + "\t" + High05 + "\t" + ID05 + "\t" +
        LastTradePrice05 + "\t" + Low05 + "\t" + Open05 + "\t" + PercentageChange05 +
        "\t" + PreviousClose05 + "\t" + Sector05 + "\t" +
        Symbol05 + "\t" + TradeCount05 + "\t" + Value05 + "\t" + Volume05;

        }

@Override
public int compareTo(Stock arg0)
        {
        // Two stocks are identical if they have the same name.
        // Use compareTo method
        return this.CompanyName05.compareTo(arg0.CompanyName05);
        }
}

