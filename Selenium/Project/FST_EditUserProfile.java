package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FST_EditUserProfile {
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

    @Test (dependsOnMethods = {"SiteAccess"})
    public void EditUserProfile() throws InterruptedException {
        //find MyInfo element in menu
        WebElement MyInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
        MyInfo.click();
        Thread.sleep(500);
        WebElement MyInfo_EditBtn = driver.findElement(By.xpath("//form[@id='frmEmpPersonalDetails']/fieldset/p/input[@id='btnSave']"));
        MyInfo_EditBtn.click();
        Thread.sleep(1000);
        //Enter First Name
        WebElement MyInfo_EditPg_FName = driver.findElement(By.id("personal_txtEmpFirstName"));
        MyInfo_EditPg_FName.clear();
        MyInfo_EditPg_FName.sendKeys("sampleFN001");
        //Enter Last Name
        WebElement MyInfo_EditPg_LName = driver.findElement(By.id("personal_txtEmpLastName"));
        MyInfo_EditPg_LName.clear();
        MyInfo_EditPg_LName.sendKeys("sampleLN001");
        //Select Gender
        WebElement MyInfo_EditPg_Gender = driver.findElement(By.id("personal_optGender_1"));
        MyInfo_EditPg_Gender.click();
        Thread.sleep(100);
        //select nationality dropdown
        WebElement MyInfo_EditPg_Nationality = driver.findElement(By.id("personal_cmbNation"));
        Select dd1=new Select(MyInfo_EditPg_Nationality);
        dd1.selectByValue("63");
        //select date of birth
        WebElement MyInfo_EditPg_DOB = driver.findElement(By.name("personal[DOB]"));
        MyInfo_EditPg_DOB.clear();
        MyInfo_EditPg_DOB.sendKeys("1980-10-12");
        MyInfo_EditPg_DOB.sendKeys(Keys.ENTER);
        //click on Save button
        WebElement MyInfo_EditPg_SaveBtn = driver.findElement(By.id("btnSave"));
        MyInfo_EditPg_SaveBtn.click();
    }
    //close the browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
