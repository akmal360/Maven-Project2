package testCases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void serchFor(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cookies");
        driver.findElement(By.className("nav-input")).click();
    }

}
