package Tests;

import Pages.QualityDemyPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTesti {

    @Test

    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.cookiesKabulButonu.click();

        qualityDemyPage.ilkLoginLinki.click();
        qualityDemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.emailKutusu.isEnabled());


    }
}
