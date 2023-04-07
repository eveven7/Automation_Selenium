import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBuyAnItem extends AbstractTest {

    @Test
    public void testBuyAnItem() {
        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[1]/div/div/div[2]/p[2]/a/u")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div[7]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[1]/div/input")).sendKeys(new CharSequence[]{"Evelina"});
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[2]/div/input")).sendKeys(new CharSequence[]{"12345678910"});
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[1]/input")).sendKeys(new CharSequence[]{"123"});
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[2]/input")).sendKeys(new CharSequence[]{"12"});
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[3]/input")).sendKeys(new CharSequence[]{"2025"});
        driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[5]/div/button")).click();



        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div/div/p"));
        Assert.assertEquals("Message is not the same", "Congratulations! Your order has been confirmed!", message.getText());
    }
}
