package com.github.kakashimamun.data.utils.discretizers;


import com.github.kakashimamun.data.frame.DataFrame;
import com.github.kakashimamun.data.frame.DataRow;


/**
 * Created by xschen on 18/8/15.
 */
public interface AttributeValueDiscretizer  {
    int discretize(double value, String index);
    DataRow transform(DataRow tuple);
    DataFrame fitAndTransform(DataFrame frame);
}
