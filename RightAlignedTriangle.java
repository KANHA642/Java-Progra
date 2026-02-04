import java.util.Scanner;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // Print spaces
            for(int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            // Print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
