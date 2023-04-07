import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestAddToCard extends AbstractTest {


    @Test
    public void testAddToCard() {

        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        WebElement allProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(allProduct.isDisplayed());
        driver.findElement(By.id("search_product")).sendKeys("Top");
        driver.findElement(By.id("submit_search")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();

        WebElement message = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[1]"));
        Assert.assertEquals("Message is not the same", "Your product has been added to cart..", message.getText());
    }
}
