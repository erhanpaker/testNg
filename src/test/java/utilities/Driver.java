 package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

   public static WebDriver driver;

    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();
        if (driver == null){
            driver= new ChromeDriver();

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

    public static void closeDriver(){
        driver.close();
    }

    // 12 video 2 saat

    public static void main(String[] args) {
        System.out.println("hithup hatasının çözümü");
    }
}
