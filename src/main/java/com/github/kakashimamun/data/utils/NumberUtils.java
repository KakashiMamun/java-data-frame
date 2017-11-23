package com.github.kakashimamun.data.utils;


import com.github.kakashimamun.data.exceptions.NotImplementedException;

import java.math.BigInteger;


/**
 * Created by xschen on 1/5/2017.
 */
public class NumberUtils {
   public static int toInt(double value){
      return (int)value;
   }

   public static boolean isZero(Double val) {
      return Math.abs(val) < 0.0000000000000000000001;
   }

   public static double toDouble(Object obj) {
      if(obj instanceof Double){
         return (Double)obj;
      } else if(obj instanceof String) {
         return Double.parseDouble((String)obj);
      } else if(obj instanceof Float) {
         return ((Float)obj).doubleValue();
      } else if(obj instanceof Integer) {
         return ((Integer)obj).doubleValue();
      } else if(obj instanceof Long) {
         return ((Long)obj).doubleValue();
      } else if(obj instanceof Boolean) {
         return (Boolean) obj ? 1.0 : 0.0;
      } else if(obj instanceof BigInteger) {
         return ((BigInteger)obj).doubleValue();
      } else if(obj == null) {
         return 0;
      } else {

         throw new NotImplementedException();
      }
   }
}
