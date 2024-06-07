package Lab3;

//OMNIA OSAMA AHMED 1084505
public class Test4
{
   public static void main(String[] args) {

       int[] array = { 3, 2, 1, 1, 2, 3};

       boolean isSymmetrical = false;

       for(int x = 0; x < array.length; x++)
       {
           if( array[x] != array[array.length - 1 -x])
           {
               isSymmetrical = false;
                break;
           }
           isSymmetrical = true;
       }

       System.out.println("Is the array symmetrical? " + isSymmetrical);
   }
}
