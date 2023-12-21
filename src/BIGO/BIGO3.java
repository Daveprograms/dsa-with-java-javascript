package BIGO;

public class BIGO3 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
// nested for loops
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
// this runs n*n = n^2 == 10k
/*
As we can see n^2 grows much faster compared to o(n) and that means from a time complexity , it is less efficient

 */


// we call this  O(n^2)