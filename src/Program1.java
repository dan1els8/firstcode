import javax.swing.*;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int[][] arrCopy = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrCopy[i][j] = arr[i][j];
            }
        }
        int soum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                soum = soum + arrCopy[i][j];

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] +i + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(soum);
        arrCopy[0][b-1] = soum;
        for (int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy.length; j++) {
                System.out.print(arrCopy[i][j] + " ");

            }
            System.out.println();
        }
    }
}
