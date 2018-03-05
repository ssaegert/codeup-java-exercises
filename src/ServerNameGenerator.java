public class ServerNameGenerator {

    public static void main(String[] args) {


    String[] adjectives = {"Good", "First", "New", "Bad", "Shiny", "Metallic", "Plastic", "Wooden", "Last", "Early"};

    String[] nouns = {"Dog", "Cat", "Building", "Floor", "Scott", "Desk", "Door", "Cup", "Mouse", "Keyboard"};

        System.out.println(randomGen(adjectives) + " - " + randomGen(nouns));


    }

        public static String randomGen (String[] array) {
        return array[(int) Math.floor(Math.random() * array.length)];
        }


}
