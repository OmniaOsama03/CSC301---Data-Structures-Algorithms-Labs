package Lab2;
public class Test2
{ //OMNIA OSAMA AHMED- 1084505
  public static void main(String[] args)
  {
            try
            {
                int[][] FlightCapacityVSOccupancy =
                        {{100, 80},
                         {90, 30},
                         {150, 145 }
                        };

                for(int i = 0; i < FlightCapacityVSOccupancy.length; i++)
                {
                    for(int j = 0; j < 2;  j++)
                    {
                        System.out.print(FlightCapacityVSOccupancy[i][j] + "\t");
                    }
                    System.out.println(" ");
	             }
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.print("inside the catch");
            }
  }
}


