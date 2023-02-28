package testNg_framework;

import org.testng.annotations.Test;
import utilities.Driver;

public class ilkTest {

    @Test

    public void test1(){

        Driver.getDriver().get("https://qualitydemy.com/");

        Driver.closeDriver();
    }


}
