public enum SeasonOfTheYear {
    WINTER(90),
    SPRING(92),
    SUMMER(92),
    AUTUMN(92);

    private int countOfDays;

    SeasonOfTheYear(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
