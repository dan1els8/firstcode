import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = j + 1;
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            if (max < arr[i][j]) {
                max = arr[i][j];
            }
                System.out.println();
                System.out.print("Максимальне число:" + max);
            }
        }
    }
}


