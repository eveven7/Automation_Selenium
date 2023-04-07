import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

//6task
public class TestWait extends AbstractTest {
//Add the first product to shopping cart by using quick view function
    @Test
    public void testWait() {


        driver.navigate().to("https://automationexercise.com/");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]")).isDisplayed());
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();

        driver.findElement(By.xpath("//u[.='View Cart']")).click();
        // Assert.assertTrue(driver.findElement(By.className("active")).isDisplayed());

    }
}
