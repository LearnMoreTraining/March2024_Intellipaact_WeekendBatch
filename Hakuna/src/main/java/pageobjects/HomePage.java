package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;
import resuable.ReadExcel;

import java.io.IOException;

public class HomePage extends BaseCode {

    public HomePage enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        return this;
    }

    public HomePage clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
        return this;
    }

    public HomePage enterProductName(String sheetName, int rowIndex, int columnIndex) throws IOException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ReadExcel.getCellValue(sheetName,rowIndex,columnIndex));
        return this;
    }


}
