import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("Enter a floating-point number:");
        float spice = input.nextFloat();
        System.out.println(spice);

        double spiceValue = (double)4/3*(Math.pow(2, (Math.sqrt(5)/(spice*spice*spice))));
        System.out.println("Well "+userName+", the spice value resulted in "+spiceValue);

        System.out.printf("And the converted value is %.2f", spiceValue);
        //System.out.println("");
        //calcWallPaint();
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = wallHeight * wallWidth;
        Math.round(wallArea);
        System.out.println("Wall area: "+wallArea+" square feet");

        gallonsPaintNeeded = (double) (wallArea / squareFeetPerGallons);

        System.out.printf("Paint needed: %.2f gallons",gallonsPaintNeeded);
        System.out.println("");
        System.out.println("Cans needed: "+(int)Math.ceil(gallonsPaintNeeded)+" can(s)");
    }


}
