package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

   public static WebDriver driver;

    public static WebDriver getDriver(){

        //  ChromeOptions ops = new ChromeOptions();
        // ops.addArguments("--remote-allow-origins=*");
       //   WebDriverManager.chromedriver().setup();
       //   WebDriver driver = new ChromeDriver(ops);

        WebDriverManager.chromedriver().setup();

        if (driver == null){
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

    public void closeDriver(){
        driver.close();
    }
}


