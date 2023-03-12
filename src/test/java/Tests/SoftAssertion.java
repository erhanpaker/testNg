package Tests;

import Pages.AmazonPage;
import utilities.Driver;
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
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"1 verify çalışmıyor");


        AmazonPage amazonPage = new AmazonPage();
        softAssert.assertTrue(amazonPage.aramaKutusuElementi.isEnabled(),"2 verify çalışmıyor");

        amazonPage.aramaKutusuElementi.sendKeys("nutella" + Keys.ENTER);

        expectedIcerik = "Nutella";
        String actualSonucYazısi = amazonPage.aramaSonucYazıElementi.getText();

        softAssert.assertTrue(actualSonucYazısi.contains(expectedIcerik),"3 verify çalışmıyor");

        softAssert.assertAll();




    }
}
