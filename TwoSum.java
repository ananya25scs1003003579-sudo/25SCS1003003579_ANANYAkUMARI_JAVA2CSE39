import java.util.Scanner;
public class TwoSum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number\n");
        int num1=sc.nextInt();
        System.out.println("Enter second number\n");
        int num2=sc.nextInt();
        int sum= num1 + num2;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
