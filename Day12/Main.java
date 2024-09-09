package Day12;

public class Main {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int col = 0;
            if (row > n) {
                col = (row - n - 2);
            }
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern7(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            int c = row > n ? 2 * n - row : row;
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

    }
}
