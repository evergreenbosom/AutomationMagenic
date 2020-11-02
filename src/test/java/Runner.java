import java.lang.reflect.Method;

import org.example.pagemodels.TestData;
import org.example.test.TestBase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner extends TestBase {


    @Test
    @TestData(testSetId="TS4",testId = "TC6",  tags = { "Stage", "authentication" })
    public void testName() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Hello";
        Assert.assertEquals(ac,ex);

    }

    @Test
    @TestData(testSetId="TS3",testId = "TC6",  tags = { "Stage", "authentication" })
    public void testName1() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Helloo";
        Assert.assertEquals(ac,ex);
    }
    @Test
    @TestData(testSetId="TS21",testId = "TC5",  tags = { "Stage", "authentication" })
    public void testName2() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Helloo";
        Assert.assertEquals(ac,ex);

    }

    // @Test
    @TestData(testSetId="TS21",testId = "TC5",  tags = { "Stage", "authentication" })
    public void testName3() throws NoSuchMethodException, SecurityException {
        reportTest();
        String ac = "Hello";
        String ex = "Helloo";
        Assert.assertEquals(ac,ex);
    }


}
