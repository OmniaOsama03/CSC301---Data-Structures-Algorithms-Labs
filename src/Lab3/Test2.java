package Lab3;
import java.io.*;
import java.util.*;

//OMNIA OSAMA AHMED 1084505
public class Test2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        for(int x = 1; x <= 10; x++ )
        {
            System.out.println("Enter value number " + x + " : ");
            int value = input.nextInt();

            list.add(value);
        }

        System.out.println("the original list is: " + list.toString());
        System.out.println("The distinct integers are: " +
                removeDuplicate(list).toString());
    }
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (Integer x : list) {
            if (!newList.contains(x))
            newList.add(x);
        }
        return newList;
    }
}
