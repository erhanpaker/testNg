package Tests;

import Pages.AmazonPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test

    public void test01(){

        Driver.getDriver().get("https://www.amazon.com/");

        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert = new  SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik));


        AmazonPage amazonPage = new AmazonPage();
        softAssert.assertTrue(amazonPage.aramaKutusuElementi.isEnabled());

        amazonPage.aramaKutusuElementi.sendKeys("Nutella" + Keys.ENTER);

        expectedIcerik = "Nutella";
        String actualSonucYazısi = amazonPage.aramaSonucYazıElementi.getText();

        softAssert.assertTrue(actualSonucYazısi.contains(expectedIcerik));

        softAssert.assertAll();

        // 12 video 45 dk

    }
}
