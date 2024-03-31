package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.ProductSpecifcPage;
import pageobjects.ResultPage;

import java.io.IOException;

public class ModifedAamzonStep {

    HomePage homePage;
    ResultPage resultPage;

    ProductSpecifcPage productSpecifcPage;
    String productName;
    public ModifedAamzonStep(){
        homePage = new HomePage();
        resultPage = new ResultPage();
        productSpecifcPage = new ProductSpecifcPage();
    }

    @Given("user search the product {string} and naviage to the result page")
    public void searchProductInHomePage(String a) throws IOException {
        productName = a;
        homePage.enterProductName(a).clickSearchIcon();
       //homePage.enterProductName("productname",0,0).clickSearchIcon();
    }

    @Then("user verify the title")
    public void userVerifyTheTitle() {

        Assert.assertEquals("Amazon.in - "+productName,resultPage.getTitlePage());

    }

    @Given("user select the product")
    public void userSelectTheProduct() throws InterruptedException {

        homePage.enterProductName("iphone").clickSearchIcon();
        resultPage.selectProduct(3);
        productSpecifcPage.naviageToChildWindow().addToKart();
    }
}
