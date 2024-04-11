import java.util.Scanner;

public class Circle implements GeometricObject {
 /**
  *   In your code, the radious variable is declared as final,
  *   meaning it can only be assigned a value once.
  *   However, you have initialized it within the constructor.
  *   When a final variable is not initialized at the time of declaration,
  *   it must be initialized in the constructor.
  *
  **/
    protected double radious;

    public Circle() {
        double radious;
        System.out.println("Enter the value for radious:");
        Scanner scanner = new Scanner(System.in);
        radious = scanner.nextInt();

        while (radious <= 0) {
            System.out.println("Please enter positive the value : ");
            radious = scanner.nextInt();
        }

        this.radious = radious;
    }

    @Override
    public double getPerimeter() {
        return 2 * ((double) 22 / 7) * radious;
    }

    @Override
    public double getArea() {
        return ((double) 22 / 7) * radious * radious;
    }
}
