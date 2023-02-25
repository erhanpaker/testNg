package testNg_framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class c_01_dependsOnMethods {

    /*
     amazon
     */
    WebDriver driver;
    @Test

    public void amamzonTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        // amazon gittiğmizi test edelim
        String expectedİcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedİcerik));

    }

    @Test
    // arama kutusunun anable olduğunu yani erişilebilir olduğunu test et
    public void aramaKutusuTesti(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());

    }

    @Test
     // arama kutusuna nutella aratın,
    public void nutellaTesti(){
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // BU kısım da ise  sonuçların nutella içerdiğini test ediyoruz!
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedİcerik = "Nutella";
        String actualAramaSonucYazisi = sonucYaziElementi.getText();

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedİcerik));



    }
}
