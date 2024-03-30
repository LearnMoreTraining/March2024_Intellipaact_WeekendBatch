package stepdefinationfile;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;
import resuable.ReadExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AmazonHomePage extends BaseCode {

    @When("user enter the product name {string}")
    public void userEnterTheProductName(String xyz) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(xyz);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

    }

    @Given("user navigates to salesforce login page")
    public void userNavigatesToSalesforceLoginPage() {
        
    }

    @Then("user validate the title")
    public void userValidateTheTitle() {
      String actualTitle =  driver.getTitle();  //Actual Result
      String expectedTitle = "Amazon.in - iphone";

        if(actualTitle.equals(expectedTitle)){

         Assert.assertTrue(true);

        }
        else{
            Assert.assertTrue(false);

        }

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String user, String pw) {
        driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(pw + Keys.ENTER);
    }

    @When("user select the required value from the category dropdown")
    public void handleCategoryDrop() {
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select catgeory = new Select(categoryElement);
       // catgeory.selectByIndex(4);
       // catgeory.selectByVisibleText("Baby");
        catgeory.selectByValue("search-alias=mobile-apps");
    }

    @When("user extract the dropdownvalues")
    public void userExtractTheDropdownvalues() {
      int currecySize =  driver.findElements(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']/child::option")).size();

      List<String> dropdownValues = new ArrayList<String>(); //empty list

        for(int i =0 ;i<currecySize;i++){

          String currencyValues=  driver.findElements(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']/child::option")).get(i).getText();
          dropdownValues.add(currencyValues);
        }
      //  Assert.assertEquals("CAD",dropdownValues.get(2));
        System.out.println(dropdownValues);

        boolean flag = false;

        for(String a:dropdownValues){

            if(a.equals("AMD")){
                flag = true;
            }
        }

        Assert.assertTrue(flag);

       boolean returnDate = driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();

       Assert.assertFalse(returnDate);

      boolean h= driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isSelected();

      driver.switchTo().alert().sendKeys("aravinth");
      driver.switchTo().alert().accept();
      Assert.assertEquals("message",driver.switchTo().alert().getText());

    }

    @When("user extract the column Values")
    public void userExtractTheColumnValues() {

       int rowCount = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/child::tr")).size();
        System.out.println(rowCount);

       int colunOneSize = driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::th")).size();
       for(int j =0 ; j < colunOneSize ;j++){

           System.out.println(driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/child::tr/child::th")).get(j).getText());
       }

        int colunTwoSize = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/child::tr/child::td")).size();
        for(int j =1 ; j < colunOneSize ;j++){

            System.out.println(driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/child::tr/child::td")).get(j).getText());
        }

        WebElement tableOne = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        for(int t =0 ; t <tableOne.findElements(By.tagName("th")).size();t++ ){
            tableOne.findElements(By.tagName("th")).get(t).getText();
        }
    }

    @Given("user clicks on baby wishlist")
    public void clickBabyList() {

        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
           Actions a = new Actions(driver) ;
           a.clickAndHold(accountListElement).build().perform();
         //  driver.findElement(By.linkText("Baby Wishlist")).click();
           driver.findElement(By.partialLinkText("Baby Wish")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));



    }

        @Then("user validates the title of the page")
        public void validateTitle() {


        }

    @Given("user perform drag and drop opeartion")
    public void dragAndDrop() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions d = new Actions(driver);
        d.dragAndDrop(dragElement,dropElement).build().perform();

        driver.switchTo().defaultContent();
    }

    @Given("user enters the username and password")
    public void userEntersTheUsernameAndPassword() throws IOException {

        driver.findElement(By.cssSelector("#username")).sendKeys(ReadExcel.getCellValue("login",0,0));
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(ReadExcel.getCellValue("login",1,0));

    }
}
