public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(300, "Sandwich", false);
//        dish.setCostInCents(768);
//        dish.setNameOfDish("Spaghetti");
//        dish.setWouldRecommend(true);
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getWouldRecommend());
//        System.out.println(dish.eat());
    }
}
