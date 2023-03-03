package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class amazonPage {
    public amazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusuElementi;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucYaziElementi;
}
