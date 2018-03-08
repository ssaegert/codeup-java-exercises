package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput;

        do {
        movieList();
        System.out.println("Enter your choice: ");
        userInput = input.getString();

        switch(userInput){
            case "1":
                allList();
                break;
            case "2":
                MoviesByCat("animated");
                break;
            case "3":
                MoviesByCat("drama");
                break;
            case "4":
                MoviesByCat("horror");
                break;
            case "5":
                MoviesByCat("scifi");
                break;
            case "6":
                MoviesByCat("musical");
                break;
        }
    } while(!userInput.equals("0"));



        System.out.println("DONE");
}

    public static void movieList() {
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
    }

    public static void allList() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            System.out.println(movie.getName() + ", " + movie.getCategory());
        }
    }

    public static void MoviesByCat(String category) {
        Movie[] allMovies = MoviesArray.findAll();

        for(Movie movie : allMovies) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + ", " + movie.getCategory());
            }
        }
    }





}
