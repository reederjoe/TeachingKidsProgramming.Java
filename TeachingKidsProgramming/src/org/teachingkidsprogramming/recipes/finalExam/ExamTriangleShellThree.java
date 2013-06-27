package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellThree
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("Please enter the size of a shell");
    if (shell < 350)
    {
      MessageBox.showMessage("The size you have chosen is too small to be seen AND...");
      MessageBox.askForNumericalInput("Please enter an updated size for the shell");
    }
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shell / 150;
        length -= largeLength;
        if (largeLength < 0)
        {
          length = shell + 5;
        }
        else
        {
          drawTriangle();
          int rotations = 7;
          Tortoise.turn(rotations * 360 / shell);
        }
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}
