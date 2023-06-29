import java.util.Scanner;
class avg {

 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();
        System.out.print("The average of entered numbers is:" + (a + b + c) / 3 );
        sc.close();
    }
}