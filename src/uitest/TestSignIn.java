import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSignIn extends AbstractTest {
//7task
    @Test
    public void testSignIn() {
        driver.get("https://automationexercise.com/");

        WebElement homePage = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(homePage.isDisplayed());

        driver.findElement(By.xpath("//a[@href='/login']")).click();

        driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("Evelina@gmail.com");
        driver.findElement(By.name("password")).sendKeys("54321");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


        Assert.assertTrue(driver.findElement(By.className("pull-right")).isDisplayed());



    }
}
