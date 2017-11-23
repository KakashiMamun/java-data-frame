package com.github.kakashimamun.data.utils.transforms;


import com.github.kakashimamun.data.frame.BasicDataFrame;
import com.github.kakashimamun.data.frame.DataFrame;
import com.github.kakashimamun.data.frame.DataRow;
import com.github.kakashimamun.data.utils.CollectionUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by xschen on 6/6/2017.
 */
public class StandardizationUnitTest {

   @Test
   public void test_data_frame(){
      DataFrame frame = new BasicDataFrame();
      DataRow row = frame.newRow();
      row.setCell("c1", 1.0);
      row.setCell("c2", 1.0);
      row.setCell("c3", 1.0);
      row.setCell("c4", 1.0);
      frame.addRow(row);

      row = frame.newRow();
      row.setCell("c1", 0.0);
      row.setCell("c2", 0.0);
      row.setCell("c3", 0.0);
      row.setCell("c4", 0.0);
      frame.addRow(row);

      frame.lock();

      Standardization coding = new Standardization(frame);
      double[] y = coding.standardize(new double[] { 1, 0, 1, 0});
      System.out.println(CollectionUtils.toList(y));
      assertThat(y).hasSize(4);
   }

   @Test
   public void test_list_of_double_array() throws CloneNotSupportedException {
      List<double[]> data = new ArrayList<>();
      data.add(new double[] { 1.0, 1.0, 1.0, 1.0 });
      data.add(new double[] { 0.0, 0.0, 0.0, 0.0 });


      Standardization coding = new Standardization(data);
      double[] y = coding.standardize(new double[] {1, 0, 1, 0});

      System.out.println(CollectionUtils.toList(y));
      assertThat(y).hasSize(4);

      Standardization clone = (Standardization)coding.clone();
      double[] y2 = clone.standardize(new double[] {1, 0, 1,0});
      assertThat(y).isEqualTo(y2);
   }
}
