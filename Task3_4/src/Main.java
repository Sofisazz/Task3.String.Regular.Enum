import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();

        if (text.isEmpty()) return;

        int count = 0;

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            count++;
        }

        System.out.println("Количество слов в тексте: " + count);
    }

}