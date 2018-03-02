public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 678;
        dish.nameOfDish = "spaghetti";
        dish.wouldRecommend = true;
        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
        System.out.println(dish.eat());
    }
}
