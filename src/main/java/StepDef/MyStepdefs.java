package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
        static WebDriver driver;

        @Given("open browser")
        public void open_browser() {
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("hello world");

        }

        @When("enter the url{string}")
        public void enterTheUrl(String url) {
                driver.get(url);
        }


        @And("click on my account")
        public void clickOnMyAccount() {

        }

        @And("enter user {string} name and password {string}")
        public void enterUserNameAndPassword(String user, String password) {
                System.out.println(user + password);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys(user);
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

        }

        @And("click on login button")
        public void clickOnLoginButton() {
                driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

        }

        @Then("login to the web page")
        public void loginToTheWebPage() {driver.findElement(By.xpath("//strong[text()='Login']")).click();
               

        }


        @When("enter the url{string}https:\\/\\/www.naukri.com\\/nlogin\\/login?msg={int}&URL=https%{int}A%{int}F%{int}Fmy.naukri.com\"")
        public void enterTheUrlHttpsWwwNaukriComNloginLoginMsgURLHttpsAFFmyNaukriCom(String arg0, int arg1, int arg2, int arg3, int arg4) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
}






