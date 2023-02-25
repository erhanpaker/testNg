package testNg_framework;

import org.testng.annotations.Test;

public class priority {

    /*
     testNg testleri isim sırasına göre çalıştırır.

     */

    @Test (priority = 5)

    public void amazonTest(){
        System.out.println("amazon");

    }

    @Test (priority = -7)

    public void youTubeTest(){
        System.out.println("youtube");

    }

    @Test

    public void wisequearterTest(){
        System.out.println("wisequertar");

    }

    @Test

    public void bestBuyTest(){
        System.out.println("bestbuy");

    }



}
