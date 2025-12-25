import java.util.Scanner;

public class Main {

    public static void getCountOfDays(String season) {
        int countOfDays = 0;
        switch (season.toLowerCase()) {
            case "зима" -> countOfDays = SeasonOfTheYear.WINTER.getCountOfDays();
            case "весна" -> countOfDays = SeasonOfTheYear.SPRING.getCountOfDays();
            case "лето" -> countOfDays = SeasonOfTheYear.SUMMER.getCountOfDays();
            case "осень" -> countOfDays = SeasonOfTheYear.AUTUMN.getCountOfDays();
        }

        if (countOfDays == 0) {
            System.out.println("Неверно введен сезон года");
            return;
        }

        System.out.println("Количество дней сезона года: " + countOfDays);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сезон года: ");
        String season = in.nextLine();

        if(season.isEmpty()) {
            System.out.println("Неверно введен сезон года");
            return;
        }

        getCountOfDays(season);

        in.close();
    }
}