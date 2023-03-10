package Tests;

import Pages.AmazonPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    @Test

    public void test01() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com");
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        AmazonPage amazonPage = new AmazonPage();
        Assert.assertTrue(amazonPage.aramaKutusuElementi.isEnabled());

        amazonPage.aramaKutusuElementi.sendKeys("Nutella" + Keys.ENTER);

        expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucYazıElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        Thread.sleep(5000);







    }
}
