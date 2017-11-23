package com.github.kakashimamun.data.utils;


import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by xschen on 14/6/2017.
 */
public class StdDevUnitTest {

   @Test
   public void test_stddev(){
      double sigma = StdDev.apply(new double[] { 1, 2, 3} , 2);

      System.out.println("sigma: " + sigma);
      assertEquals(sigma, 1.0);
   }
}
