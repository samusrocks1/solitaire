import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Card {
    private int cardNumber;
    private String suit;
    private String cardNum;
    private BufferedImage cardImage;

    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
        if (this.cardNumber < 13) {
            this.suit = "Clubs";
            if (this.cardNumber == 0){
                this.cardNum = "Ace";
            }
            else if (this.cardNumber == 10){
                this.cardNum = "Jack";
            }
            else if (this.cardNumber == 11){
                this.cardNum = "Queen";
            }
            else if (this.cardNumber == 12) {
                this.cardNum = "King";
            }
            else {
                int card = this.cardNumber + 1;
                this.cardNum = Integer.toString(card);
            }
        }
        else if (this.cardNumber < 26) {
            this.suit = "Diamonds";
            int tempNum = this.cardNumber-13;
            if (tempNum == 0){
                this.cardNum = "Ace";
            }
            else if (tempNum == 10){
                this.cardNum = "Jack";
            }
            else if (tempNum == 11){
                this.cardNum = "Queen";
            }
            else if (tempNum == 12) {
                this.cardNum = "King";
            }
            else {
                int card = tempNum + 1;
                this.cardNum = Integer.toString(card);
            }
        }
        else if (this.cardNumber < 39) {
            this.suit = "Hearts";
            int tempNum = this.cardNumber-26;
            if (tempNum == 0){
                this.cardNum = "Ace";
            }
            else if (tempNum == 10){
                this.cardNum = "Jack";
            }
            else if (tempNum == 11){
                this.cardNum = "Queen";
            }
            else if (tempNum == 12) {
                this.cardNum = "King";
            }
            else {
                int card = tempNum + 1;
                this.cardNum = Integer.toString(card);
            }
        }
        else if (this.cardNumber < 52) {
            this.suit = "Spades";
            int tempNum = this.cardNumber-39;
            if (tempNum == 0){
                this.cardNum = "Ace";
            }
            else if (tempNum == 10){
                this.cardNum = "Jack";
            }
            else if (tempNum == 11){
                this.cardNum = "Queen";
            }
            else if (tempNum == 12) {
                this.cardNum = "King";
            }
            else {
                int card = tempNum + 1;
                this.cardNum = Integer.toString(card);
            }
        }
        String imagePath = System.getProperty("user.dir") + "/src/Card Images/" + this.cardNumber + ".jpg";
        try {
            this.cardImage = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public BufferedImage getCardImage() {
        return cardImage;
    }

    public void setCardImage(BufferedImage cardImage) {
        this.cardImage = cardImage;
    }
}
