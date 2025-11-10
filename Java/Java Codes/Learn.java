import java.util.*;

public class Learn {

    public static int fact(int number) {
        if ((number == 0) || (number == 1)) {
            return 1;
        }
        return number * fact(number - 1);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = input.nextInt();
        System.out.println("The Factorial Of Number "+n+" is "+fact(n));

        input.close();
    }
}
