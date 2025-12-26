import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = in.nextLine();

        int count = 0;

        Pattern pattern = Pattern.compile("[^\\s\\wА-я\\d]");
        Matcher matcher = pattern.matcher(stroka);
        while(matcher.find()){
            count++;
        }

        System.out.println("Количество знаков препинания: " + count);
        in.close();
    }
}

