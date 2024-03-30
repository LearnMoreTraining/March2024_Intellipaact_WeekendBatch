package stepdefinationfile;


import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;


import java.io.IOException;

public class Hooks extends BaseCode {

    @Before()  //before start of each and every scenario
    public void startMethod() throws IOException {
        System.out.println("Execution Started");
        BaseCode.browserCall();

    }

    @After()
    public void endMethod(){

        System.out.println("Execution Ended");
     //   driver.quit();
    }

    @BeforeStep()
    public void m1(){

    }

    @AfterStep()
    public void takeScreenshot(Scenario sc){

       byte[] imageBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(imageBytes,"image/png",sc.getName());
    }



}
