package com.github.kakashimamun.data.utils;


import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by xschen on 14/6/2017.
 */
public class MeanUnitTest {

   @Test
   public void test_mean(){
      double mean = Mean.apply(new double[]{
              1, 2, 3, 4, 5
      });
      assertThat(mean).isEqualTo((5 + 1) / 2.0);
   }
}
