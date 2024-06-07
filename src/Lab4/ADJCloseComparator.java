package Lab4;
//Omnia Osama Ahmed 1084505
import java.util.*;
 class ADJCloseComparator implements Comparator<Stock>
{
    // Compares two stocks using their adjusted closing price ADJClose

    public int compare(Stock s1, Stock s2)
    {
        if (s1.compareTo(s2) == 0) {
            if (s1.ADJClose05 == s2.ADJClose05)
                return 0;
            else if (s1.ADJClose05 > s2.ADJClose05) return 1;
            else return -1;
        }
         else return s1.compareTo(s2);
    }


}