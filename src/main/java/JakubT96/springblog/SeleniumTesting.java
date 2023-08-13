package JakubT96.springblog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

    public static void proklikaniWebu() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:8080/");
        try {
            Thread.sleep(3200);  // časová prodleva
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.className("articles")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("skills")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("reference")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("kontakt-tlacitko")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("register")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("JakubT96@seznam.cz");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Podhorkou234", Keys.RETURN);
        Thread.sleep(1000);
        driver.findElement(By.className("clanky-tlacitko")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("title")).sendKeys("Zkouška Selenium test");
        Thread.sleep(1000);
        driver.findElement(By.id("description")).sendKeys("Vyzkouším Selenium Web driver");
        Thread.sleep(1000);
        driver.findElement(By.id("content")).sendKeys("Vyzkouším Selenium Web driver a pokusím se" +
                " přidat jako nový článek. Musel jsem vypnout TinyMCE");
        Thread.sleep(1000);
        driver.findElement(By.className("clanky-tlacitko")).click();
    }
}
