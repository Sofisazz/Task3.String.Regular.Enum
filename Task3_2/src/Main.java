import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();

        if (text.isEmpty()) return;

        StringBuilder stroka = new StringBuilder();
        String[] words = text.split("\\s*[\\s,!.;:?]+\\s*");
        System.out.println(Arrays.toString(words));
        for(String word : words) {
            stroka.append(word.charAt(word.length()-1));
        }

        System.out.println("Полученный текст: " + stroka);
        in.close();
    }
}

