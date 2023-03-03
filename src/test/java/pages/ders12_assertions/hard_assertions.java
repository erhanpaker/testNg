package pages.ders12_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class hard_assertions {

    @Test

    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");

        // amzon gittiğimizi test edin
        String expectedicerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedicerik));

        // amazon arama sayfasının enable olduğunu test edin...



    }


}
