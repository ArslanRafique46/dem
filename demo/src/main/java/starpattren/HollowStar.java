package starpattren;

public class HollowStar {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }

        }
        System.out.println();


    }
}