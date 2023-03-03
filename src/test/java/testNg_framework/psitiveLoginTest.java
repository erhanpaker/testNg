package testNg_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class psitiveLoginTest {

    @Test

    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage  qualitydemyPage = new QualitydemyPage();

        qualitydemyPage.ilkLoginLinki.click();
        QualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerLiUsername"));
        QualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerLiPassword"));

        QualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.basariliGiris.isEnabled());

        Thread.sleep(300);
        Driver.closeDriver();
    }
}
