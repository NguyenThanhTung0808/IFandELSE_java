import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int number1, number2, largest;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        number1 = in.nextInt();
        System.out.print("Enter the Second Number: ");
        number2 = in.nextInt();

        if (number1 > number2)
            largest = number1;
        else
            largest = number2;

        System.out.println("\nLargest = " + largest);

    }
}


