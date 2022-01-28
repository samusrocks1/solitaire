import java.util.ArrayList;
import java.util.Collections;

public class MainScreen {
    private static ArrayList<Card> deckOfCards = new ArrayList<>();
    public static void main(String[] args) {
    createCards();
    }

    public static void createCards() {
        for (int index = 0; index < 52; index++) {
            deckOfCards.add(new Card(index));
        }
        Collections.shuffle(deckOfCards);
        for (int index = 0; index < deckOfCards.size(); index++) {
            //System.out.println(deckOfCards.get(index).getCardNum() + " " + deckOfCards.get(index).getSuit());
        }
    }
}
