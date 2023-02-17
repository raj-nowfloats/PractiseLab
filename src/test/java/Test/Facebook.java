package Test;

import Base.LabBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook extends LabBase {

    @Test
    public void testFacebookTitle(){

        driver.get(prop.getProperty("url"));
        String title = driver.getTitle();

        Assert.assertEquals(title,"Facebook – log in or sign up");
        System.out.println("Title is : "+title);
    }
}
