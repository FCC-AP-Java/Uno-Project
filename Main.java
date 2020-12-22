import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    ArrayList<UnoCard> userDeck = new ArrayList<UnoCard>();
    for (int i = 0; i < 7; i++)
    {
      UnoCard card = new UnoCard();
      userDeck.add(card);
    }

    System.out.println("My hand:");
    System.out.println(userDeck);

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