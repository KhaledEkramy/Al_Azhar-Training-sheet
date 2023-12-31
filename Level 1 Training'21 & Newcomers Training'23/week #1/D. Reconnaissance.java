import java.util.Scanner;

public class Reconnaissance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && Math.abs(heights[i] - heights[j]) <= d) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}