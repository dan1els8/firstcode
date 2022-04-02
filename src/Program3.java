import java.util.Scanner;

class Program3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        test(n);
    }
    static void test(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}