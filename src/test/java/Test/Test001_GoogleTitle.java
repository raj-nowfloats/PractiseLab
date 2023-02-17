package Test;

import Base.LabBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001_GoogleTitle extends LabBase {

    @Test
    public void testGoogleTitle(){

        driver.get(prop.getProperty("url"));
        String title = driver.getTitle();

        Assert.assertEquals(title,"Facebook – log in or sign up");
        System.out.println("Title is : "+title);
    }
}
