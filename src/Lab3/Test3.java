package Lab3;
import java.util.*;
import java.io.*;

//OMNIA OSAMA AHMED 1084505
public class Test3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] goldPrices =
                {
                        { 18, 159, 158, 170 },
                        { 21 ,186, 176, 196 },
                        { 22, 195, 181, 206 },
                        { 24 , 213, 202, 234 },
                };

        System.out.println("Input the weight: ");
        int Weight = scanner.nextInt();

        System.out.println("Input the CaratType ");
        int CaratType = scanner.nextInt();

        System.out.println("Input the day bought: ");
        int Day = scanner.nextInt();

        int Cost = 0;
        boolean Done = false;

        for(int i = 0; i < 3 && !Done; i++)
            if (CaratType == goldPrices[i][0])
            {
                Cost  = goldPrices[i][Day]* Weight;
                Done = true;
            }

        System.out.println(" The Cost is: " + Cost);

        // dispaly to total cost of the piece for that the last 3 days and
        // for all carat types.
        for(int i = 0; i < 4; i++)
        {
            System.out.println(goldPrices[i][0] + "K:  ");

            for(int j = 1; j < 4; j++)
                System.out.print(goldPrices[i][j]*Weight + "\t") ;
            System.out.println();

        }
    }//end main
}

