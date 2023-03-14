package Tests.erhan;

import Pages.QualityDemyPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTesti {

    //bir test meetodu oluşturun

    @Test

    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.cookiesKabulButonu.click();




        qualityDemyPage.ilkLoginLinki.click();
        qualityDemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.basariliGiris.isEnabled());

        Thread.sleep(5000);


    }
}
