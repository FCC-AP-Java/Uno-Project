import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    ArrayList<UnoCard> playerDeck = new ArrayList<UnoCard>();
    for (int i = 0; i < 7; i++)
    {
      UnoCard card = new UnoCard();
      playerDeck.add(card);
    }

    System.out.println("My hand:");
    System.out.println(playerDeck);

    ArrayList<UnoCard> computerDeck = new ArrayList<UnoCard>();
    for (int i = 0; i < 7; i++)
    {
      UnoCard card = new UnoCard();
      computerDeck.add(card);
    }

    System.out.println("Computer hand:");
    System.out.println(computerDeck);
  }
}