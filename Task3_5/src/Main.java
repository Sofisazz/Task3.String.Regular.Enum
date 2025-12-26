import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = in.nextLine();

        Pattern pattern = Pattern.compile("<p\\s+[^><]*>");
        Matcher matcher = pattern.matcher(stroka);
        String newStr = matcher.replaceAll("<p>");

        System.out.println("\nНовая строка:\n" + newStr);
        in.close();
    }
}
