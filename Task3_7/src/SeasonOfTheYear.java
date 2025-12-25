public enum SeasonOfTheYear {
    WINTER("Холодный воздух, хруст снега, замерзшие водоемы, белые сугробы.", 90),
    SPRING("Время пробуждения природы после зимы, когда дни становятся длиннее и теплее, солнце светит ярче, тает снег, бегут ручьи, а природа оживает.", 92),
    SUMMER("Cамое теплое время года с длинными световыми днями, жарой и ярким солнцем.", 92),
    AUTUMN("Яркая и переходная пора года, наполненная золотом листвы, прохладным воздухом и ароматом дождей.", 92);

    private String description;
    private int countOfDays;

    SeasonOfTheYear (String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
