package BIGO;

public class BIGO2 {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }

    }

    // n+n = 2n which is  o(n) drop constantBIG0


    public static void main(String[] arags) {
        printItems(10);

    }
}

