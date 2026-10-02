public class SeasonMain {
  public static void main(String[] args) {
    Season favoriteSeason = Season.SUMMER;

    System.out.println("Любимое время года: " + favoriteSeason);
    printFavoriteSeason(favoriteSeason);

 
        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(
                    season
                    + ", средняя температура: "
                    + season.getAverageTemperature()
                    + " °C, описание: "
                    + season.getDescription()
            );
        }
    }

    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
