package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#8
    //  Do the following 4 times --#9
    //      drawSquare (recipe below) --#7
    //      ------------- Recipe for drawSquare --#6
    //      Do the following 4 times --#5
    Tortoise.setPenColor(Colors.getRandomColor());
    Tortoise.move(50);
    //          Turn the tortoise 90 degrees to the right --#4
    //      Repeat
    //      ------------- End of drawSquare recipe --#6
    //      Turn the tortoise 90 degrees to the right --#10
    //  Repeat
  }
}
