import java.util.Scanner;

public class RickshawFare
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the distance travelled?");
        double dis= scan.nextDouble();
        System.out.println("Distance travelled: " +dis+ " km.");
        System.out.println("How much time did it take to reach said distance?");
        int time=scan.nextInt();
        System.out.println("Time taken: " +time +" minutes.");
        scan.nextLine();
        System.out.println("Are you a local?(yes/no)");
        String Local=scan.nextLine();
        boolean isLocal = (Local== "no")? true : false;
        System.out.println("Is it currently night?(yes/no)");
        String Night= scan.nextLine();
        boolean isNight = (Night=="yes") ? true : false;
        if(isLocal==true || isNight==true){
            double fare= 2*(dis* time);
            System.out.println("The total cost of the rickshaw ride is increased to: "+fare);
        }
        else{
            double fare= dis* time;
            System.out.println("The total cost of the rickshaw ride is: "+fare);
        }  
    }
}