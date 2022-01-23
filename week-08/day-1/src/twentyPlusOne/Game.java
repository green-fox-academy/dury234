package twentyPlusOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    int opponentsScore;
    int currentScore;
    ArrayList<Card> hand;

    public void setOpponentsScore() {
        opponentsScore = (int) (Math.random() * 7) + 15;
    }

    private Game() {
        hand = new ArrayList<>();
    }

    public void startGame() {
        Game game = new Game();
        Deck deck = new Deck();
        deck.shuffleDeck();
        setOpponentsScore();

        for (int i = 0; i < 2; i++) {
            Card card = deck.pullRandom();
            currentScore += card.rank.getValue();
            hand.add(card);
        }

        System.out.println("Welcome to the game");
        System.out.println("Your first card is: " + hand.get(0).rank + " of " + hand.get(0).suit);
        System.out.println("Your second card is: " + hand.get(1).rank + " of " + hand.get(1).suit);
        System.out.println("Your current score is: " + currentScore + "\n");
        Scanner scanner = new Scanner(System.in);

        while (currentScore <= 21) {

            System.out.println("If you would like to draw another card, type \"+\", if not, type any other character:");
            String answer = scanner.nextLine();

            if (answer.equals("+")) {
                Card card = deck.pullRandom();
                currentScore += card.rank.getValue();
                hand.add(card);

                if (currentScore > 21) {
                    System.out.println("Your next card is: " + hand.get(hand.size() - 1).rank + " of " + hand.get(hand.size() - 1).suit);
                    System.out.println("Your current score is: " + currentScore);
                    System.out.println("YOU LOST");
                    break;
                }

                System.out.println("Your next card is: " + hand.get(hand.size() - 1).rank + " of " + hand.get(hand.size() - 1).suit);
                System.out.println("Your current score is: " + currentScore + "\n");

            } else if (currentScore > opponentsScore) {
                System.out.println("Your opponents score is: " + opponentsScore);
                System.out.println("CONGRATULATIONS! YOU WON!");
                break;
            } else if (currentScore == opponentsScore) {
                System.out.println("Your opponents score is: " + opponentsScore);
                System.out.println("It's a draw.");
                break;
            } else {
                System.out.println("Your opponents score is: " + opponentsScore);
                System.out.println("You lost.");
                break;
            }
        }

    }


    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
