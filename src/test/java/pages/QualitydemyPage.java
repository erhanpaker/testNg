package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class QualitydemyPage  {

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id = "login-email")
    public WebElement emailKutusu;







}
