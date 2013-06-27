package org.teachingkidsprogramming.recipes;

import junit.framework.Assert;

import org.junit.Test;

public class FizzBuzzTest
{
  @Test
  public void test1Produces1()
  {
    Assert.assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void test2Produces2()
  {
    Assert.assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3ProducesFizz()
  {
    Assert.assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4Produces4()
  {
    Assert.assertEquals("4", FizzBuzz.convert(4));
  }
  public void testMutliplesof3ProducesFizz()
  {
    Assert.assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void test5ProducesBuzz()
  {
    Assert.assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void testMulitplesOf5ProducesBuzz()
  {
    Assert.assertEquals("Buzz", FizzBuzz.convert(10));
  }
  @Test
  public void test15ProducesFizzBuzz()
  {
    Assert.assertEquals("FizzBuzz", FizzBuzz.convert(15));
  }
  @Test
  public void testMultiplesOf3And5ProducesFizzBuzz()
  {
    Assert.assertEquals("FizzBuzz", FizzBuzz.convert(3 * 5 * 4));
  }
}
