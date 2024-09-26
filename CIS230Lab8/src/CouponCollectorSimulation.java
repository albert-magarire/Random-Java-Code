import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CouponCollectorSimulation {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);
        boolean[] suitPicked = new boolean[suits.length];
        int picksNeeded = 0;
        Random random = new Random();

        while (!allSuitsPicked(suitPicked)) {
            String pickedCard = deck.get(random.nextInt(deck.size()));
            System.out.println(pickedCard);

            for (int i = 0; i < suits.length; i++) {
                if (pickedCard.contains(suits[i]) && !suitPicked[i]) {
                    suitPicked[i] = true;
                    break;
                }
            }

            picksNeeded++;
        }

        System.out.println("Number of picks: " + picksNeeded);
    }

    private static boolean allSuitsPicked(boolean[] suitPicked) {
        for (boolean picked : suitPicked) {
            if (!picked) {
                return false;
            }
        }
        return true;
    }
}
