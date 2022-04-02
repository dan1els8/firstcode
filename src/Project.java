import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random in = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число = " + max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число = " + min);

        double ser = 0;
        for (int i = 0; i < arr.length; i++) {
            ser += arr[i];
        }
        ser/= arr.length;
        System.out.println("Средние число = " + ser);
    }
}
