package utils;

import org.junit.Assert;

/**
 * Created by sadha on 20/06/2016.
 */
public class Verify {
    public static void  verifyTrue(boolean cond){
        Assert.assertTrue(cond);

    }
    public static void  verifyEqual(String actual,String expect){
        Assert.assertEquals(actual,expect);

    }


}
