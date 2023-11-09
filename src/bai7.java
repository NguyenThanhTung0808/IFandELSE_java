import java.util.Scanner;
public class bai7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter The Number : ");
        num = input.nextInt();

        System.out.print("Absolute Number is : " + Math.abs(num));
    }
}

