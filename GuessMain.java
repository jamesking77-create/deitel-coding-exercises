package deitelChapters.chapterSix;

public class GuessMain {
    public static void main(String[] args) {
        GuessingGame.registerPlayer();
        do {
            GuessingGame.playGuessingGame();
        }while (GuessingGame.gameIsNotOver());

    }
}
