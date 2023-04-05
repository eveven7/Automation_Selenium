import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class FormTest extends AbstractTest {
//test if we get a submit message
    @Test
    public void testContactUsForm() {

        driver.findElement(By.cssSelector
                ("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a")).click();
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input")).sendKeys("Evelina");
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input")).sendKeys("Evelina@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Message");
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input")).submit();


        driver.switchTo().alert().accept();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));
        Assert.assertEquals("Message is not the same", "Success! Your details have been submitted successfully.", message.getText());
        System.out.println("Test passed , message is the same" + " " + message.getText());


    }
}
