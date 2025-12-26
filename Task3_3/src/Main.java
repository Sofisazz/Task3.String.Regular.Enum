import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static StringBuilder findHex(String str){
        StringBuilder newStr = new StringBuilder();

        Pattern pattern = Pattern.compile("0x[0-9A-F]+");
        Matcher matcher = pattern.matcher(str);

        newStr.append("Полученные шестнадцатеричные числа из строки:\n");

        while (matcher.find()) {
            newStr.append(matcher.group());
            newStr.append("\n");
        }

        return newStr;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = in.nextLine();

        System.out.print(findHex(stroka));
        in.close();
    }
}
