package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FST_AddEmpQualification {
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

    @Test(dependsOnMethods = {"SiteAccess"})
    public void AddEmployeeQualification() throws InterruptedException {
        //find MyInfo element in menu
        WebElement MyInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
        MyInfo.click();
        Thread.sleep(500);
        //find Qualification element from Left Navigation
        WebElement LeftNav_Qualification = driver.findElement(By.xpath("//div[@id='employee-details']/descendant::ul[@id='sidenav']/li[9]"));
        LeftNav_Qualification.click();
        //click on Add Button in Work Experience Page
        WebElement Qualification_AddBtn = driver.findElement(By.id("addWorkExperience"));
        Qualification_AddBtn.click();
        //Enter company details
        WebElement Qualification_AddDetails_Company = driver.findElement(By.id("experience_employer"));
        Qualification_AddDetails_Company.sendKeys("ABCOrg");
        Thread.sleep(100);
        //Enter job title
        WebElement Qualification_AddDetails_JobTitle = driver.findElement(By.id("experience_jobtitle"));
        Qualification_AddDetails_JobTitle.sendKeys("Tester");
        Thread.sleep(100);
        //Enter from date
        WebElement Qualification_AddDetails_FromDt = driver.findElement(By.id("experience_from_date"));
        Qualification_AddDetails_FromDt.clear();
        Thread.sleep(100);
        Qualification_AddDetails_FromDt.sendKeys("2020-01-30");
        Thread.sleep(100);
        //Enter to date
        WebElement Qualification_AddDetails_ToDt = driver.findElement(By.id("experience_to_date"));
        Qualification_AddDetails_ToDt.clear();
        Qualification_AddDetails_ToDt.sendKeys("2022-12-11");
        Thread.sleep(100);
        //click on save button
        WebElement Qualification_AddDetails_SaveBtn = driver.findElement(By.id("btnWorkExpSave"));
        Qualification_AddDetails_SaveBtn.click();
        Thread.sleep(200);
    }

    //close the browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
