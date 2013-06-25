package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 1; i <= 200; i++)
    {
      adjustPen();
      Tortoise.move(60);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int width = 1;
    Tortoise.setPenWidth(+1);
    if (4 < width)
    {
      Tortoise.setPenWidth(width);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Grays.DarkSlateGray);
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Purples.Indigo);
  }
}
