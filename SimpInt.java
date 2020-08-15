import java.util.Scanner;
public class SimpInt
{  
    public static void main(String args[])
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.println("Enter the Rate Of Interest : ");
        r = scan.nextFloat();
        System.out.println("Enter the Time Period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}

