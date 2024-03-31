package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class ResultPage extends BaseCode {


    public String getTitlePage(){

      String title= driver.getTitle();
      return title;
    }

    public void selectProduct(int resultIndex){

        driver.findElement(By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-"+resultIndex+"']/descendant::a")).click();
    }


}
