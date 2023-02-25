package testNg_framework;

import org.testng.annotations.Test;

public class dependsOnMethods {

     @Test(priority = 5)
    public void amazonTest(){
         System.out.println("amazon");
     }

     @Test(priority = -7,dependsOnMethods = "amazonTest")
    public void youTubeTest(){
         System.out.println("youTube");
     }

     @Test
    public void wisequeaterTest(){
         System.out.println("wisequertar");
     }

     @Test
    public void bestBuyTest(){
         System.out.println("bestbuy");
     }


}
