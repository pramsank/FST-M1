package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FST_DashBd_ApplyLeave {
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
    public void DashBrd_ApplyLeave() throws InterruptedException {
        //Identify and click on Dashboard from Menu
        WebElement DashBoard = driver.findElement(By.id("menu_dashboard_index"));
        DashBoard.click();
        //Identify Apply Leave Option and click on it
        WebElement ApplyLeave = driver.findElement(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']/table[1]/tbody[1]/tr[1]/td[4]/div"));
        ApplyLeave.click();
        //select from leave type dropdown
        Select SelectLeaveType_DrpDwn = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        SelectLeaveType_DrpDwn.selectByVisibleText("DayOff");
        Thread.sleep(100);
        //Enter from date in Apply Leave Page
        WebElement Qualification_ApplyLeave_FromDt = driver.findElement(By.id("applyleave_txtFromDate"));
        Qualification_ApplyLeave_FromDt.clear();
        Thread.sleep(100);
        Qualification_ApplyLeave_FromDt.sendKeys("2022-12-08");
        Thread.sleep(100);
        //Enter to date in Appy Leave Page
        WebElement Qualification_ApplyLeave_ToDt = driver.findElement(By.id("applyleave_txtToDate"));
        Qualification_ApplyLeave_ToDt.clear();
        Qualification_ApplyLeave_ToDt.sendKeys("2022-12-08");
        Thread.sleep(100);
        //Enter Comments section
        WebElement Qualification_ApplyLeave_Comments = driver.findElement(By.id("applyleave_txtComment"));
        Qualification_ApplyLeave_Comments.sendKeys("MyTest123");
        Thread.sleep(100);
        //click on apply button in Apply Leave Page
        WebElement Qualification_ApplyLeave_ApplyBtn = driver.findElement(By.id("applyBtn"));
        Qualification_ApplyLeave_ApplyBtn.click();
        Thread.sleep(200);
    }
    @Test(dependsOnMethods = {"DashBrd_ApplyLeave"})
    public void MyLeaveSearch() throws InterruptedException {
        //Click on MyLeave Option in the SubMenu of Leave
        WebElement Qualification_Leave_MyLeave = driver.findElement(By.id("menu_leave_viewMyLeaveList"));
        Qualification_Leave_MyLeave.click();
        Thread.sleep(200);
        //Search for the Leave Details
        //Enter from date in Apply Leave Page
        WebElement Qualification_MyLeave_FromDt = driver.findElement(By.id("calFromDate"));
        Qualification_MyLeave_FromDt.clear();
        Thread.sleep(100);
        Qualification_MyLeave_FromDt.sendKeys("2022-12-08");
        Thread.sleep(100);
        //Enter to date in Appy Leave Page
        WebElement Qualification_MyLeave_ToDt = driver.findElement(By.id("calToDate"));
        Qualification_MyLeave_ToDt.clear();
        Qualification_MyLeave_ToDt.sendKeys("2022-12-08");
        Thread.sleep(100);
        //click on Search button in My Leave Page
        WebElement Qualification_MyLeave_SearchBtn = driver.findElement(By.id("btnSearch"));
        Qualification_MyLeave_SearchBtn.click();
        Thread.sleep(200);
        //assertion
        String LeaveResultTbl_Status = driver.findElement(By.xpath("//div[@id='tableWrapper']/table[1]/descendant::tbody/tr[1]/td[6]/a")).getText();
        Assert.assertEquals("Pending Approval(1.00)", LeaveResultTbl_Status);
        System.out.println(LeaveResultTbl_Status);
    }
    //close the browser
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


