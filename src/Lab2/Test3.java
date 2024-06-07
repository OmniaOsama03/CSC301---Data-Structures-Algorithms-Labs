package Lab2;

import java.io.*;
import java.util.*;

public class Test3
{ //Omnia Osama Ahmed- 1084505
    public static void main(String[] args) throws FileNotFoundException
    {

    java.io.File file = new java.io.File("C://Users//maado//Downloads//population.txt");
    Scanner scanner = new Scanner(file);

    int[][] population = new int[18][2];

    while (scanner.hasNext())
    {
        for (int x = 0; x < population.length; x++)
        {
            for (int y = 0; y < 2; y++)
            {
                population[x][y]= scanner.nextInt();
                System.out.print(population[x][y] + " ");
            }
            System.out.println();
        }
    }
    scanner.close();
    }
}


