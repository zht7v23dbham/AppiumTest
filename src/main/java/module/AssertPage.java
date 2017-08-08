package module;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.asserts.*;

/**
 * Created by dell on 2017/8/7.
 */
public  class AssertPage {
    public static ElementExist el = new ElementExist();
    public static String var1;
    public static String var2;
    public static boolean bvar;
    public static String message;
    public static Object actual;
    public static Object expected;
    public static Object object;
    //assertFalse：判断是否为false。
    public static void AssertTrue(boolean bvar)
    {
        System.out.println("before test 判断是否为True");
        Assert.assertTrue(bvar);
        System.out.println("after test 判断是否为True");
    }
    // assertSame：判断引用地址是否相同。
//    public static void AssertSame ()
//    {
//        System.out.println("before test 判断引用地址是否相同");
//        Assert.assertSame();
//        System.out.println("after test 判断引用地址是否相同");
//    }
//    // assertNotSame：判断引用地址是否不相同。
//    public static void AssertNotSame ()
//    {
//        System.out.println("before test 判断引用地址是否不相同");
//        Assert.assertNotSame();
//        System.out.println("after test 判断引用地址是否不相同");
//
//    }

    // assertNull：判断是否为null。
    public static void AssertNull(Object object, String message)
    {
        System.out.println("before test 判断是否相等");
        Assert.assertNull(object,  message);
        System.out.println("before test 判断是否相等");
    }
    // assertNotNull：判断是否不为null。
    public static  void AssertNotNull(Object object, String message)
    {
        System.out.println("before test 判断是否相等");
        Assert.assertNotNull(object, message);
        System.out.println("before test 判断是否相等");
    }
    // assertEquals：判断是否相等，Object类型的对象需要实现haseCode及equals方法。
    public static void AssertEquals(String var1, String var2, String message ,AppiumDriver driver)
    {
        System.out.println("before test 判断是否相等");
        Assert.assertEquals(var1, var2, message );
        el.waitForElementByName(var1, driver);
        System.out.println("before test 判断是否相等");
    }
    // assertNotEquals：判断是否不相等。
    public static void AssertNotEquals(String var1, String var2, String message)
    {
        System.out.println("before test 判断是否不相等");
        Assert.assertNotEquals(var1, var2, message);
        System.out.println("before test 判断是否不相等");
    }
    // assertEqualsNoOrder：判断忽略顺序是否相等。
    public  static void AssertEqualsNoOrder(String var1, String var2, String message)
    {
        System.out.println("before test 判断忽略顺序是否相等");
   //     Assert.assertEqualsNoOrder(actual , expected ,"");
        System.out.println("before test 判断忽略顺序是否相等");
    }
}
