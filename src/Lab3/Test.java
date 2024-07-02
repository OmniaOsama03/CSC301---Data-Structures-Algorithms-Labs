package Lab3;

import java.util.*;
import java.io.*;
public class Test
{

    public static void main(String[] args)
    {
        Integer[] myArray = {3, 5, 9, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(myArray));//…………… convert myArray to list
        max(newArray);

    }
    public static Integer max(ArrayList<Integer> list)
    {
        int max = list.get(0);

        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
                max = list.get(i);
        }
            return max;
    }
}
