import java.util.Date;

public class Main {
    public static void main(String[] args){

        String stroka = "";
        Date dateStr1 = new Date();

        for (int i = 0; i < 1_000_000; i++) {
            stroka += "aaabbbccc";
        }
        Date dateStr2 = new Date();

        Date dateBuilder1 = new Date();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append("aaabbbccc");
        }
        Date dateBuilder2 = new Date();

        System.out.println("Скорость выполнения сложений строк с помощью оператора сложения: " + (dateStr2.getTime() - dateStr1.getTime()) + " миллисекунд");
        System.out.println("Скорость выполнения сложений строк с помощью StringBuilder: " + (dateBuilder2.getTime() - dateBuilder1.getTime()) + " миллисекунд");
    }
}