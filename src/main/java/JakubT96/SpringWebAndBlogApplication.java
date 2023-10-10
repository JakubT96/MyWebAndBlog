package JakubT96;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringWebAndBlogApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringWebAndBlogApplication.class, args);
       // SeleniumTesting.proklikaniWebu();
     /*   WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:8080/account/login");
        Thread.sleep(1200);  // časová prodleva

        driver.findElement(By.id("email")).sendKeys("JakubT96@seznam.cz");
        driver.findElement(By.id("password")).sendKeys("Podhorkou234", Keys.RETURN);

        Thread.sleep(2200);  // časová prodleva


      */
    }
    // zkusit napsat JUnit testy a Selenium

    /*

    OBNOVENÍ FUNKCE LOCAL HOST V TERMINÁLU:

    lsof -n -i4TCP:8080
    kill -9  PID
    PID se musí doplnit!!
 -----------------------------------------------------------

    ZAPNUTÍ MYSQL V XAMPP

     sudo killall mysqld
     sudo /Applications/XAMPP/xamppfiles/bin/mysql.server start
 ------------------------------------------------------------

     */
}
