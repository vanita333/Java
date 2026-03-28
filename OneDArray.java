import java.util.*;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Create array of size n
        int[] a = new int[n];

        // Store elements in array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}