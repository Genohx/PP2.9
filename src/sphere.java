import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class sphere
{
    public static void main(String[] arg)
    {
        double r;
        double volume, surface;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        r = keyboard.nextDouble();

        volume = ((4.0/3.0)*Math.PI*Math.pow(r, 3));
        surface = ((4*Math.PI)*Math.pow(r, 2));
        DecimalFormat fmt = new DecimalFormat("0.####");

        System.out.println("Volume = " + fmt.format(volume));
        System.out.println("Surface = " + fmt.format(surface));

    }
}
