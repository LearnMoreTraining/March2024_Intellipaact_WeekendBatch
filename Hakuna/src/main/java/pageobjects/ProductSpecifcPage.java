package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

import java.time.Duration;
import java.util.Set;

public class ProductSpecifcPage extends BaseCode {
    
    public ProductSpecifcPage naviageToChildWindow(){

        String parentWindow=driver.getWindowHandle();
       Set<String> winProperties = driver.getWindowHandles();
       for(String prop:winProperties){

           if(!prop.equals(parentWindow)){
               driver.switchTo().window(prop);
               System.out.println(driver.getTitle());
           }
       }


       return this;
    }

    public ProductSpecifcPage addToKart() throws InterruptedException {

        Thread.sleep(Duration.ofSeconds(10));
        driver.findElement(By.id("add-to-cart-button")).click();
        return this;
    }

    public void clickBuy(){

    }

    public void switchToParentWindow(){

        driver.switchTo().defaultContent();
    }
}
