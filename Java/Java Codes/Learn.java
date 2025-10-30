import java.util.*;

public class Learn {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int n = input.nextInt();
        // System.out.println("Enter the Column : ");
        // int m = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
