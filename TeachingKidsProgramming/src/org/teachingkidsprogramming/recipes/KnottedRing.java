package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //      createColorPalette (recipe below) --#6
    //      ------------- Recipe for createColorPalette --#6
    ColorWheel.addColor(Colors.Pinks.HotPink);
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Pinks.Fuchsia);
    //      Add orange red to the color wheel --#14
    ColorWheel.addColor(Colors.Reds.Red);
    //      Add deep pink to the color wheel --#15
    //      Add medium violet red to the color wheel --#16
    //      Add crimson to the color wheel --#17
    //      Add tomato to the color wheel --#18
    //      ------------- End of createColorPalette recipe --#6
    //      Do the following 30 times --#10
    //              Change the color of the line the tortoise draws to a random color from the color wheel --#5
    //              drawOctagonWithOverlap (recipe below) --#8
    //              ------------- Recipe for drawOctagonWithOverlap --#7
    //              Do the following 8 + 1 times --#3
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
    //              Repeat 
    //              ------------- End of drawOctagonWithOverlap recipe --#7
    //       Turn the tortoise 1/30th of 360 degrees to the right --#9
    //       Turn the tortoise 5 more degrees to the right --#11
    //       Repeat 
  }
}
