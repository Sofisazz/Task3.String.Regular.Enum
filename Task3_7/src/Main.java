public class Main {
    public static void main(String[] args){
        SeasonOfTheYear winter = SeasonOfTheYear.WINTER;
        SeasonOfTheYear spring = SeasonOfTheYear.SPRING;
        SeasonOfTheYear summer = SeasonOfTheYear.SUMMER;
        SeasonOfTheYear autumn = SeasonOfTheYear.AUTUMN;

        System.out.println("\nОписание зимы: " + winter.getDescription() + "\nКоличество дней: " + winter.getCountOfDays());
        System.out.println("\nОписание весны: " + spring.getDescription() + "\nКоличество дней: " + spring.getCountOfDays());
        System.out.println("\nОписание лета: " + summer.getDescription() + "\nКоличество дней: " + summer.getCountOfDays());
        System.out.println("\nОписание осени: " + autumn.getDescription() + "\nКоличество дней: " + autumn.getCountOfDays());
    }
}