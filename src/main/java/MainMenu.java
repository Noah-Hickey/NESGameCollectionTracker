
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainMenu {

        // Array List to store games //
        private static List<Games> gameCatalog = new ArrayList<>();

        private static Scanner scanner = new Scanner(System.in);

        private static long nextId = 1;


    public static void main(String[] args) {
        while (true) {

            System.out.println("======================================================");
            System.out.println();
            System.out.println("            NES Game Collection Menu");
            System.out.println();
            System.out.println("======================================================");

            System.out.println();
            System.out.println();

            System.out.println("Select from the following options: ");
            System.out.println();
            System.out.println("1: My Story with the NES");
            System.out.println();
            System.out.println("2: Add a Game to the Collection");
            System.out.println();
            System.out.println("3: Remove a Game from the Collection");
            System.out.println();
            System.out.println("4: Randomly select a Game");
            System.out.println();
            System.out.println("5. Exit");
            System.out.println();

            switch (scanner.nextLine()) {
                case "1" -> displayStory();
                case "2" -> addGame();
                case "3" -> removeGame();
                case "4" -> randomizeGame();
                case "5" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option, please try again.");

            }

        }
}

public static void displayStory(){

    System.out.println("======================================================");
    System.out.println("  My Story with the Nintendo Entertainment System");
    System.out.println("======================================================");
    System.out.println();

    System.out.println("During a summer vacation to visit family in Alberta, ");
    System.out.println("I went to many garage sales to look at old antiques");
    System.out.println("with my family. At one of these garage sales, I found");
    System.out.println("something that caught my eye: a box with a console I");
    System.out.println("never saw before: the Nintendo Entertainment System.");
    System.out.println();

    System.out.println("In the box was the console, hookups, about 10 games,");
    System.out.println("2 controllers, and the famous Zapper light gun.");
    System.out.println("The people sellingit told me it no longer worked");
    System.out.println("anymore. I purchased the box and mailed it back");
    System.out.println("to Newfoundland. I purchased everything for $30.");
    System.out.println();

    System.out.println("When I returned home, I researched about the console.");
    System.out.println("I learned about the great video game crash of the ");
    System.out.println("1980s and it was the Nintendo Entertainment System");
    System.out.println("[NES abbreviated] that brought quality back to home");
    System.out.println("console gaming at the time.");
    System.out.println();

    System.out.println("I also learned that the console could be fixed easily");
    System.out.println("if you purchased a part called a 72 pin connector.");
    System.out.println("I purchased one for $30 -which made me realize what");
    System.out.println("a great deal I got for the system bundle and it");
    System.out.println("worked!");
    System.out.println();

    System.out.println("I hooked it up in my dad's shed with a CRT TV.");
    System.out.println("My friends and I would come together to have ");
    System.out.println("snacks, chat, and play NES games together for");
    System.out.println("many years until I completed high school.");
    System.out.println();

    System.out.println("During those years, I collected games from the");
    System.out.println("local game store an hour away every so often.");
    System.out.println("A couple of years ago, I began collecting games");
    System.out.println("again that I wanted to expand my collection.");
    System.out.println();

    System.out.println("The NES was one of the most memorable game consoles");
    System.out.println("I've ever had and after 40 years later, the console");
    System.out.println("I bought many years ago still functions great.");
    System.out.println("From the memories my friends and I had racking up");
    System.out.println("high scores or trying extremely difficult games");
    System.out.println("to the history of the console's importance in history.");
    System.out.println();

    System.out.println("The NES is a great piece of technology for it's time.");
    System.out.println("For me as a history buff, it feels great to");
    System.out.println("own a great piece of history to share with my friends");
    System.out.println("and family. I believe the NES console and its great game");
    System.out.println("library remains timeless and will continue to amaze people");
    System.out.println("into the future as time goes on!");
    System.out.println();
    System.out.println();

}

public static void addGame() {
    System.out.println();
    System.out.println("======================================================");
    System.out.println("           Add a Game to the Collection!");
    System.out.println("======================================================");


    System.out.println();
    System.out.println("Enter the Game Title:");
    String gameTitle = scanner.nextLine();

    System.out.println();
    System.out.println("Enter the year the game was released: ");
    int releaseYear;
    try {
        releaseYear = Integer.parseInt(scanner.nextLine());  // Fixed: was Scanner.nextLine()
    } catch (NumberFormatException e) {
        System.out.println("Invalid year format. Please try again.");
        return;
    }


    System.out.println();
    System.out.println("Enter the genre of the game: ");
    String gameGenre = scanner.nextLine();

    System.out.println();
    System.out.println("Enter your personal rating of the game(1-10): ");
    int personalRating;
    // Check that rating is between 1-10 only //
    try {
        personalRating = Integer.parseInt(scanner.nextLine());
        if (personalRating < 1 || personalRating > 10) {
            System.out.println("Rating must be between 1 and 10. Please try again.");
            return;
        }
    }catch(NumberFormatException e){
            System.out.println("Invalid rating format. Please try again.");
            return;
        }



    System.out.println();
    System.out.println("Enter a personal anecdote about the game: ");
    String personalAnecdote = scanner.nextLine();

    System.out.println();
    gameCatalog.add(new Games(nextId++, gameTitle, releaseYear, gameGenre, personalRating, personalAnecdote));
    System.out.println("Game added!");
    }

    private static void removeGame(){
        System.out.println();
        System.out.println("======================================================");
        System.out.println("         Remove a game from the Collection!");
        System.out.println("======================================================");
        System.out.println();

        if (gameCatalog.isEmpty()) {
            System.out.println("Game collection is empty!");
            System.out.println();
            return;
        }

        System.out.println("______________________________________________________");
        System.out.println("            Games in the collection");
        System.out.println("______________________________________________________");
        System.out.println();

        // Display all games with their Ids //
        for (Games game : gameCatalog) {
            System.out.println("ID: " + game.getId() + " - " + game.getGameTitle());
        }
        System.out.println();

        // Get user input and validate the format //
        System.out.print("Enter the ID of the game to remove: ");
        long gameId;
        try {
            gameId = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
            return;
        }

        //  Loop through the catalog and find the game //
        boolean removed = false;
        for (int i = 0; i < gameCatalog.size(); i++) {
            if (gameCatalog.get(i).getId() == gameId) {
                Games removedGame = gameCatalog.remove(i);
                System.out.println("Game" + removedGame.getGameTitle() + " was removed!");
                removed = true;
                break;
            }

        }
        if (!removed) {
            System.out.println("Game with ID " + gameId + " was not found!");
        }

    }

    private static void randomizeGame() {
        System.out.println("======================================================");
        System.out.println("              Random Game Selection!");
        System.out.println("======================================================");
        System.out.println();

        if (gameCatalog.isEmpty()) {
            System.out.println("Game collection is empty! Add some games first.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(gameCatalog.size());
        Games randomGame = gameCatalog.get(randomIndex);

        System.out.println();
        System.out.println("______________________________________________________");
        System.out.println("              Your random game is:");
        System.out.println("______________________________________________________");
        System.out.println();
        System.out.println(randomGame.toString());
    }

}