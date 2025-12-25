import java.util.Scanner;

public class Main {

    public static SeasonOfTheYear getNextSeason(String season) {
        SeasonOfTheYear nextSeason = null;
        switch (season.toLowerCase()) {
            case "зима" -> nextSeason = SeasonOfTheYear.SPRING;
            case "весна" -> nextSeason = SeasonOfTheYear.SUMMER;
            case "лето" -> nextSeason = SeasonOfTheYear.AUTUMN;
            case "осень" -> nextSeason = SeasonOfTheYear.WINTER;
        }
       return nextSeason;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сезон года: ");
        String season = in.nextLine();
        SeasonOfTheYear getSeason = getNextSeason(season);

        if(season.isEmpty() || getSeason == null) {
            System.out.println("Неверно введен сезон года");
            return;
        }

        String nextSeason = "";
        switch (getSeason) {
            case WINTER -> nextSeason = "зима";
            case SPRING -> nextSeason = "весна";
            case SUMMER -> nextSeason = "лето";
            case AUTUMN -> nextSeason = "осень";
        }

        System.out.println("Следующий сезон года: " + nextSeason);
        in.close();
    }
}