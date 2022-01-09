package ChromeSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class StepsForChrome {

    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    //@Given("Launch browser {string}")
    public void launch_browser(String browser){
        if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "C:\\SeleniumTraining\\drivers\\msedriver.exe");
                driver = new EdgeDriver();
            }
        }
    @Given("Launch browser")
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\drivers\\chromedriver.exe");
                 driver = new ChromeDriver();
    }
    @Then("Maximize the window")
    public void maximizeTheWindow() {
        driver.manage().window().maximize();
    }
    @When("Navigate to amazon home page")
    public void navigate_to_amazon_home_page() {
        driver.get("https://www.amazon.in/");
    }
    @Then("Verify the amazon logo is displayed")
    public void verify_the_amazon_logo_is_displayed() {
        WebElement amazon_logo = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
        //amazon_logo.isDisplayed();
        Assert.assertTrue(amazon_logo.isDisplayed(), "logo is displayed");

    }
    @Then("verify the title contains Online Shopping site in India:")
    public void verifyTheTitleContainsOnlineShoppingSiteInIndia() {
        String AmazonHomeTitle = driver.getTitle();
        Assert.assertTrue(AmazonHomeTitle.contains("Online Shopping site in India:"));
    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();
    }
    /// S1 ///
    // Test 2 //
    @Then("click on the sign-in button")
    public void clickOnTheSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    }

    @When("page opens verify the title as {string}")
    public void pageOpensVerifyTheTitleAs(String arg0) {
        String LoginPageTitle= driver.getTitle();
        Assert.assertEquals("Amazon Sign In",LoginPageTitle);
    }
    /// S1 ///
    // Test 3 //
    @When("sign in page comes verify continue button is enabled")
    public void signInPageComesVerifyContinueButtonIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isEnabled());
    }

    @And("also check for create account button")
    public void alsoCheckForCreateAccountButton() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).isEnabled());
    }

    /// S1 ///
    // Test 4 //
    @When("sign page appears put correct mobile number")
    public void signPageAppearsPutCorrectMobileNumber() {
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("6200928816");
    }

    @And("click continue button")
    public void clickContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @Then("verify password filling page is populated or not")
    public void verifyPasswordFillingPageIsPopulatedOrNot() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).isDisplayed());
    }

    /// S1 ///
    // Test 5 //
    @When("sign page appears put incorrect mobile number")
    public void signPageAppearsPutIncorrectMobileNumber() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kuchv00@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
    }

    @Then("capture the error message")
    public void captureTheErrorMessage() {
        String errmsg = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div")).getText();
        System.out.println(errmsg);
    }

    /// s1 ///
    // Test 6 //
    @Then("put correct password and click sign in button")
    public void putCorrectPasswordAndClickSignInButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Demo=00");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
    }

    @And("verify login is successful or not")
    public void verifyLoginIsSuccessfulOrNot() {
        String verifytittle =driver.getTitle();
        //System.out.println(verifytittle);
        Assert.assertTrue(verifytittle.contains("Online Shopping site in India:"));
        System.out.println("login success and Scenario 1 passed");
    }
    /// s2 ///
    // Test 1 //
    @When("home page appears check search box is enabled or not")
    public void homePageAppearsCheckSearchBoxIsEnabledOrNot() {
        boolean b1= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).isEnabled();
        Assert.assertTrue(b1);
    }

    @And("check search box is empty by default or not")
    public void checkSearchBoxIsEmptyByDefaultOrNot() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
        Thread.sleep(2000);
        String mssgONsearchBOX=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getText();
        //System.out.println(mssgONsearchBOX+"1");
        //Assert.assertNull(mssgONsearchBOX);
        Assert.assertEquals("",mssgONsearchBOX);
    }
    /// s2 ///
    // Test 2 //
    @When("home page appears check search button is enabled or not")
    public void homePageAppearsCheckSearchButtonIsEnabledOrNot() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).isEnabled());
    }
    /// s2 ///
    // Test 3 //
    @And("locate search box and type {string}")
    public void locateSearchBoxAndType(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(1000);
    }
    @Then("check the title contains {string} or not")
    public void checkTheTitleContainsOrNot(String arg0) {
        String title2 = driver.getTitle();
        System.out.println(arg0);
        Assert.assertTrue(title2.contains(arg0));
    }
    /// s2 ///
    // Test 4 //
    @Then("print {string}")
    public void print(String arg0) {
        System.out.println(arg0);
    }

    /// S3 ///
    // test 1 //
    @Then("check cart button is enabled")
    public void checkCartButtonIsEnabled() {
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).isEnabled();
        //driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
        String count_Cart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).getText();
        Assert.assertEquals("0",count_Cart);
        //System.out.println(count_Cart);
    }
    /// S3 ///
    // Test 2 //
    @Then("check default value is zero")
    public void checkDefaultValueIsZero() {
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).isEnabled();
        String count_Cart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).getText();
        Assert.assertEquals("0",count_Cart);
        //System.out.println(count_Cart);
    }
    /// S3 ///
    // Test 3 //
    @Then("Check Add to cart button is enabled")
    public void checkAddToCartButtonIsEnabled() {
        ArrayList<String> NewWindow= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(NewWindow.get(1));
        boolean cartbutton= driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled();
        Assert.assertTrue(cartbutton);
    }
    /// S3 ///
    // Test 4 //
    @Then("Search for {string}")
    public void searchFor(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(2000);
    }
    @And("add to cart first five products")
    public void addToCartFirstFiveproducts() throws InterruptedException {

        /*1st product*/  driver.findElement(By.xpath("//span[normalize-space()='realme Smart Watch S Pro with 3.53 cm (1.39\") AMOLED Touchscreen, 14 Days Battery Life, SpO2 & Heart Rate Monitoring, 5ATM Water Resistance']")).click();
        ArrayList<String> tab1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab1.get(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab1.get(0));

        /*2nd product*/ driver.findElement(By.xpath("//span[normalize-space()='realme Smart Watch S Pro with 3.53 cm (1.39\") AMOLED Touchscreen, 14 Days Battery Life, SpO2 & Heart Rate Monitoring, 5ATM Water Resistance']")).click();
        Thread.sleep(2000);
        ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab2.get(2));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab2.get(0));

        /*3rd product*/driver.findElement(By.xpath("//span[normalize-space()='realme Smart Watch S Pro with 3.53 cm (1.39\") AMOLED Touchscreen, 14 Days Battery Life, SpO2 & Heart Rate Monitoring, 5ATM Water Resistance']")).click();
        Thread.sleep(2000);
        ArrayList<String> tab3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab3.get(3));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab3.get(0));

        /*4th product*/  driver.findElement(By.xpath("//span[normalize-space()='realme Smart Watch S Pro with 3.53 cm (1.39\") AMOLED Touchscreen, 14 Days Battery Life, SpO2 & Heart Rate Monitoring, 5ATM Water Resistance']")).click();
        Thread.sleep(2000);
        ArrayList<String> tab4 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab4.get(4));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab4.get(0));

        /*5th product*/  driver.findElement(By.xpath("//span[normalize-space()='realme Smart Watch S Pro with 3.53 cm (1.39\") AMOLED Touchscreen, 14 Days Battery Life, SpO2 & Heart Rate Monitoring, 5ATM Water Resistance']")).click();
        Thread.sleep(2000);
        ArrayList<String> tab5 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab5.get(5));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab5.get(0));
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();

    }

    @And("add to cart first five product")
    public void addToCartFirstFiveproduct() throws InterruptedException {
        /*1st product*/  driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
        ArrayList<String> tab6 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab6.get(6));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab6.get(0));

        /*2nd product*/ driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
        Thread.sleep(2000);
        ArrayList<String> tab7 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab7.get(7));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab7.get(0));

        /*3rd product*/  driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
        Thread.sleep(2000);
        ArrayList<String> tab8 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab8.get(8));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab8.get(0));

        /*4th product*/  driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
        Thread.sleep(2000);
        ArrayList<String> tab9 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab9.get(9));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.switchTo().window(tab9.get(0));

        /*5th product*/  driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
        Thread.sleep(2000);
        ArrayList<String> tab10 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab10.get(10));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        //driver.switchTo().window(tab10.get(0));
    }
    @Then("verify the total numbers of products added is {int} or not")
    public void verifyTheTotalNumbersOfproductsAddedIsOrNot(int arg0) {
        int count_Cart = Integer.parseInt((driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).getText()));
        //Assert.assertEquals(arg0,count_Cart);
        System.out.println("total products added in cart = " + count_Cart);
        Assert.assertEquals(arg0,count_Cart);
    }
    /// S4 ///
    // Test 1 //
    @Then("check best sellers category is enabled")
    public void checkBestSellersCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@href,'/gp/bestsellers/?ref_=nav_cs_bestsellers')]")).isEnabled());
    }
    @When("click on best sellers card category")
    public void clickOnBestSellersCardCategory() {
        driver.findElement(By.xpath("//a[contains(@href,'/gp/bestsellers/?ref_=nav_cs_bestsellers')]")).click();
    }
    @Then("verify the title of the page which would contain {string}")
    public void verifyTheTitleOfThePageWhichWouldContain(String arg0) {
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.contains(arg0));
    }
    @And("navigate back")
    public void navigateBack() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(2000);
    }
    /// S4 ///
    // Test 2 //
    @Then("check mobiles category is enabled")
    public void checkMobilesCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).isEnabled());
    }
    @When("click on mobiles card category")
    public void clickOnMobilesCardCategory() {
        driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
    }
    /// S4 ///
    // Test 3 //
    @Then("check customer service category is enabled")
    public void checkCustomerServiceCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Customer Service']")).isEnabled());
    }
    @When("click on customer service card category")
    public void clickOnCustomerServiceCardCategory() {
        driver.findElement(By.xpath("//a[normalize-space()='Customer Service']")).click();
    }
    /// S4 ///
    // Test 4 //
    @Then("check electronics category is enabled")
    public void checkElectronicsCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).isEnabled());
    }

    @When("click on electronics card category")
    public void clickOnElectronicsCardCategory() {
        driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();
    }
    /// S4 ///
    // Test 5 //
    @Then("check fashion category is enabled")
    public void checkFashionCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Fashion']")).isEnabled());
    }

    @When("click on fashion card category")
    public void clickOnFashionCardCategory() {
        driver.findElement(By.xpath("//a[normalize-space()='Fashion']")).click();
    }
    /// S4 ///
    // Test 6 //
    @Then("check today's deal category is enabled")
    public void checkTodaySDealCategoryIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']")).isEnabled());
    }

    @When("click on today's deal card category")
    public void clickOnTodaySDealCardCategory() {
        driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']")).click();
    }
    /// S5 ///
    // Test 1 //
    @Then("Input {string} in search box")
    public void inputInSearchBox(String arg0) {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    }
    @And("Click on first product visible")
    public void clickOnFirstProductVisible() {
        driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Core Java: An Integrated Approach, New: Includes A')]")).click();
    }
    @Then("Check wishlist is enabled")
    public void checkWishlistIsEnabled() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span")).isEnabled());
    }
    /// S5 ///
    // Test 2 //
    @Then("Add the product to wishlist")
    public void addTheProductToWishlist() {
        ArrayList<String> NewWindow= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(NewWindow.get(1));
        driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]/span/a")).click();
    }
    @And("capture the reason for not adding it to wishlist")
    public void captureTheReasonForNotAddingItToWishlist() {
        String msg = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div")).getText();
        System.out.println(msg);
    }
    /// S6 ///
    // Test 1 //
    @Then("verify sort by dropdown is enabled or not")
    public void verifySortByDropdownIsEnabledOrNot() {
        boolean dropdown = driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).isEnabled();
        Assert.assertTrue(dropdown);
    }
    /// S6 ///
    // Test 2 //
    @And("verify the number of options available")
    public void verifyTheNumberOfOptionsAvailable() {
        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]")));
        List<WebElement> elements = dropDown.getOptions();
        Assert.assertEquals(5,elements.size());
    }
    /// S6 ///
    // Test 3 //
    @Then("check {string} option is enabled or not")
    public void checkOptionIsEnabledOrNot(String arg0) {
        boolean b1 = false;
        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]")));
        List<WebElement> AllElements = dropDown.getOptions();
        for (WebElement Element : AllElements) {
            String dropdownOptionValue = Element.getText();
            System.out.println(dropdownOptionValue);
            if (dropdownOptionValue.equals(arg0)) {
                b1 = true;
            }
        }
        Assert.assertTrue(b1);
    }
    /// s6 ///
    // Test 4 //
    @Then("sort the product by {string}")
    public void sortTheProductBy(String arg0){
        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]")));
        dropDown.selectByVisibleText(arg0);
    }

    @And("click on the first product")
    public void clickOnTheFirstProduct() {
        driver.navigate().refresh();
        driver.findElement(By.xpath("//span[normalize-space()='Definitive Guide to DAX, The: Business intelligence for Microsoft Power BI, SQL Server Analysis Services, and Excel (Business Skills)']")).click();
    }
    @Then("verify {string} item added in the wishlist")
    public void verifyItemAddedInTheWishlist(String arg0) {

    }
    /// S6 ///
    // Test 5 //
    @And("print the name of the product added")
    public void printTheNameOfTheProductAdded() {

    }
}
