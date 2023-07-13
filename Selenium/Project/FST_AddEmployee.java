package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FST_AddEmployee {
    //declare a webdriver
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        //install gecko driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        //initialize firefox driver
        driver = new FirefoxDriver();
        //Implicit wait time set
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //launch the page
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);
    }

    @Test(priority = 0)
    public void SiteAccess() throws InterruptedException {
        // Login To Site
        WebElement Uid = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtUsername']"));
        Uid.sendKeys("orange");
        WebElement pwd = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='txtPassword']"));
        pwd.sendKeys("orangepassword123");
        WebElement clickbtn = driver.findElement(By.xpath("//form[@id='frmLogin']/div/input[@id='btnLogin']"));
        clickbtn.click();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void AddEmployee() throws InterruptedException {
        //find PIM element and click
        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();

        //click on Add Button
        WebElement AddBtn = driver.findElement(By.id("btnAdd"));
        AddBtn.click();

        //Add employee first name and last name
        driver.findElement(By.id("firstName")).sendKeys("sample_fn");
        driver.findElement(By.id("lastName")).sendKeys("sample_ln");

        //click save button
        WebElement SaveBtn = driver.findElement(By.id("btnSave"));
        SaveBtn.click();
    }
    @Test(priority = 2)
        public void searchEmployee() throws InterruptedException {
        //Employee List
        WebElement EmpList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        EmpList.click();
        Thread.sleep(3000);
        //search for employee
        WebElement empSearchTxBx = driver.findElement(By.xpath("//input[contains(@id,'empsearch_employee_name_empName')]"));
        empSearchTxBx.clear();
        empSearchTxBx.sendKeys("sample_fn sample_ln");
        empSearchTxBx.sendKeys(Keys.ENTER);
        empSearchTxBx.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //click on search button
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        searchButton.click();
        Thread.sleep(3000);
        //Search output results
        String resultTbleRow1FN = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]/a")).getText();
        Assert.assertEquals("sample_fn", resultTbleRow1FN);
        System.out.println(resultTbleRow1FN);
        String resultTbleRow1LN = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[4]/a")).getText();
        Assert.assertEquals("sample_ln", resultTbleRow1LN);
        System.out.println(resultTbleRow1LN);
    }

    //close the browser
    @AfterClass
    public void tearDown() {
       driver.quit();
    }

}
