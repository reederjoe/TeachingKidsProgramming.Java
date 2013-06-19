package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuiz
{
  public void question1()
  {
    //  The current length is 7
    length = 7;
  }
  //
  //      Question2
  //      Create a method called medium
  //       that sets the current length to 21
  @Override
  public void medium()
  {
    // TODO Auto-generated method stub
    super.medium();
    length = 21;
  }
  //
  //
  //      Question3
  //      Create a method called large
  //       that sets the current length to 63
  @Override
  public void large()
  {
    // TODO Auto-generated method stub
    super.large();
    length = 63;
  }
  //
  //
  //      Question4
  //      Create a method called moveTheLength
  //       that moves the Tortoise the current length
  @Override
  public void moveTheLength()
  {
    // TODO Auto-generated method stub
    super.moveTheLength();
    Tortoise.move(21);
  }
  //
  //
  //      Question5
  //      Create a method called turnTheCorner
  //       that turns the Tortoise 1/3 of 360 degrees to the left
  //
  //
  //      Question6
  //      Create a method called drawASide
  //       that calls moveTheLength and turnTheCorner 
  //
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
