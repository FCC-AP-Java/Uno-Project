import java.util.*;
import java.lang.Math;

public class UnoCard
{
  private int number;
  private String color;

  public UnoCard()
  {
    number = (int)(Math.random()*9) + 1;
    int randColor = (int)(Math.random()*3);
    if (randColor == 0)
    {
      color = "R";
    }
    else if (randColor == 1)
    {
      color = "G";
    }
    else if (randColor == 2)
    {
      color = "Y";
    }
    else
    {
      color = "B";
    }
  }

  public String toString()
  {
    return color + number;
  }
}