package BIGO;

public class BIG04 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
// this is o(n^2)


        for(int k=0; k<n; k++){
            System.out.println(k);
        }
      // And this run o(n) = 100


        // so now we add both o(n^2) + o(n)
        // o(n^2 + n)
        // the more n grows the more n^2 grows if n is 100, n^2 will be 10k


        //Known as Drop non- dominant

    }

    public static void main(String[] args) {
        printItems(10);
    }
}
