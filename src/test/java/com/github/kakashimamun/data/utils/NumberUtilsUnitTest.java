package com.github.kakashimamun.data.utils;


import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by xschen on 14/6/2017.
 */
public class NumberUtilsUnitTest {

   @Test
   public void test_toDouble(){
      assertThat(NumberUtils.toDouble("0.1")).isEqualTo(0.1);
      assertThat(NumberUtils.toDouble(true)).isEqualTo(1);
      assertThat(NumberUtils.toDouble(false)).isEqualTo(0);
      assertThat(NumberUtils.toDouble(1)).isEqualTo(1.0);
      assertThat(NumberUtils.toDouble(1L)).isEqualTo(1.0);
      assertThat(NumberUtils.toDouble(1.0f)).isEqualTo(1.0);
      assertThat(NumberUtils.toDouble(new BigInteger("2"))).isEqualTo(2.0);

   }
}
