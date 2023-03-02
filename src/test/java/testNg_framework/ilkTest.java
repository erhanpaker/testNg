package testNg_framework;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class ilkTest {

    @Test

    public void test1(){

        Driver.getDriver().get("https://qualitydemy.com/");

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // doğru kullanıc adı ve şifre ile giriş yapın

        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        qualitydemyPage.loginButonu.click();

        // erhan

        Driver.closeDriver();
    }


}
