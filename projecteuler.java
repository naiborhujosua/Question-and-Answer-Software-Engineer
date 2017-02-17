/**
 *
 * @author Josua Antonius Naiborhu
 * Problem Project Euler
 * @since February 17,2017
 * 
 */
public class AmicableNumbers {
   public static void main(String[]args){
       int total = 0;
       for(int i=1;i<10000;i++)
       {
           int divTotal =getDivissorsTotal(i);
           if(i!=divTotal && i==getDivissorsTotal(divTotal))
           {
               total+=i;
           }
       }
       System.out.println(total);
   }
   
   private static int getDivissorsTotal(int number)
   {
       int total=0;
       for(int j=1;j<number;j++)
       {
           if(number %j==0)
           {
               total +=j;
           }
       }
       return total;
   }
}
