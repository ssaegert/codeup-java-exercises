public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.mostPopularTopping = "pickles";
        BurgerTools.averageDaysBeforeExpiration = 5;
        BurgerTools.temperatureWhenCooked = 116;

        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();


    }
}
