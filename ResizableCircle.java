import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(){
        super();
    }

    @Override
    public void resize(int precent) {
        int precentinput;

        System.out.println("Enter the value precentage value for radious:");
        Scanner scanner = new Scanner(System.in);
        precentinput = scanner.nextInt();

        while (precentinput < -100 || precentinput > 100) {
            System.out.println("Please enter positive the value : ");
            precentinput = scanner.nextInt();
        }

        super.radious += (super.radious/100) * precentinput;
        System.out.println("New radious"+ super.radious);
    }
}
