package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FST_EmergencyContacts {
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
    public void MyEmergencyContactTbl() throws InterruptedException {
        //find MyInfo element in menu
        WebElement MyInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
        MyInfo.click();
        Thread.sleep(500);
        //find Emergency Contact element from Left Navigation
        WebElement LeftNav_EmergencyContact = driver.findElement(By.xpath("//div[@id='content']/descendant::ul[@id='sidenav']/li[3]"));
        LeftNav_EmergencyContact.click();
        Thread.sleep(500);
        //Validate page title and find the table in the emergency contacts page
        String message = driver.findElement(By.xpath("//div[@id='listEmegrencyContact']/div[1]/h1")).getText();
        System.out.println("page title is: " + message);
        //find the table
        WebElement EmergencyContacts_Tbl = driver.findElement(By.xpath("//table[@id='emgcontact_list']/tbody"));
        Thread.sleep(100);
        //calculate the rows of the table
        List<WebElement> rowsOfTbl = EmergencyContacts_Tbl.findElements(By.tagName("tr"));
        int rows_count = rowsOfTbl.size();
        System.out.println("Number of rows: " + rows_count);
        //get number of columns in each row
        for (int row = 0; row < rows_count; row++) {
            //get number of columns
            List<WebElement> ColsOfRow = rowsOfTbl.get(row).findElements(By.tagName("td"));
            int cols_count = ColsOfRow.size();
            System.out.println("Number of Cells in row" + row + "are: " + cols_count);
            //retrieve and print details of each row on the console
            for (int cols = 1; cols < cols_count; cols++) {
                String cellTxt = ColsOfRow.get(cols).getText();
                System.out.println("Details of row number " + row + "Is: " + cellTxt);
            }
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
