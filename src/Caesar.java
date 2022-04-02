import java.util.Scanner;
import java.util.Arrays;
public class Caesar {

    static String[] alphabet = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х",
            "ц","ч","ш","щ","ъ","ы","ь","э","ю","я"};
//---------------------------------------------------------------------------------------------------|
    public static void Encrypt() {
        System.out.println("Введите сообщение которые вы хотите зашифровать:");
        Scanner sr = new Scanner(System.in);
        String message = sr.nextLine();
        String cyphertext = "";
        for (int i = 0; i < message.length(); i++) {
            String c = Character.toString(message.charAt(i));
            if (c.equals(" ")) {
                cyphertext +=c;
                continue;
            }
            Integer position = Arrays.asList(alphabet).indexOf(c);
            cyphertext += alphabet[position + 3];

        }
        System.out.println(cyphertext);
    }

//---------------------------------------------------------------------------------------------------|
    public static void Decrypt() {

    }
//---------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        System.out.println("Здраствуйте!Что бы вы хотели зделать?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Зашифровать сообщение");
        System.out.println("2. Расшифровать сообщение");
        System.out.println("3. Выйти из программы");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Encrypt();
                break;
            case 2:
                Decrypt();
                break;
            case 3:
                System.out.println("Досвидания!Заходите еще!");
                return;
          default:
                System.out.println("Вы не выбрали не один из варинтов ответа!");
                break;
        }
    }
}
