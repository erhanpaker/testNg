package Tests;

import Pages.QualityDemyPage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ilkTest {

    @Test

    public void test01(){

        Driver.getDriver().get("https://qualitydemy.com/");

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.ilkLoginLinki.click();

        qualityDemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualityDemyPage.passwordKutusu.sendKeys("Nevzat152032");
        qualityDemyPage.loginButonu.click();

        // giriş yapıldığını test edin kodum
        Assert.assertTrue(qualityDemyPage.basariliGiris.isDisplayed());




    }
}
