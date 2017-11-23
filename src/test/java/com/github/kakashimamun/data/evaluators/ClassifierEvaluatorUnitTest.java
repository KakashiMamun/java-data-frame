package com.github.kakashimamun.data.evaluators;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by xschen on 13/6/2017.
 */
public class ClassifierEvaluatorUnitTest {

   @Test
   public void test_evaluate(){
      ClassifierEvaluator evaluator = new ClassifierEvaluator();
      evaluator.reset();

      for(int i=0; i < 50; ++i) {
         String predicted = "class1";
         String actual = "class2";
         evaluator.evaluate(actual, predicted);
      }
      for(int i=0; i < 50; ++i) {
         String predicted = "class3";
         String actual = "class3";
         evaluator.evaluate(actual, predicted);
      }

      assertThat(evaluator.getAccuracy()).isEqualTo(0.5);
      assertThat(evaluator.getMacroF1Score()).isEqualTo(1.0);
      assertThat(evaluator.getMicroF1Score()).isCloseTo(0.333, within(0.001));

      evaluator.report();
      System.out.println(evaluator.getConfusionMatrix().toString());
      System.out.println("avg false positives: " + evaluator.avgFalsePositive());
      System.out.println("avg true positives: " + evaluator.avgTruePositive());
      evaluator.getFalloutByClass();
   }
}
