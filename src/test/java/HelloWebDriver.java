import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HelloWebDriver {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/downloads/");
    Thread.sleep(2000);//после открытия веб-страницы поток будет приостановлен на 2 секунды перед завершением работы драйвера
    driver.quit();


    //В приведенном ниже коде, мы создаем объект WebDriverWait с указанным временем ожидания (10 секунд в данном случае).
    // Затем мы используем метод until() и передаем ожидаемое условие из класса ExpectedConditions.

    driver = new EdgeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.selenium.dev/downloads/");
    WebElement element = driver.findElement(By.xpath("//h1[@class='display-1' and text()='Downloads']"));
    wait.until(ExpectedConditions.visibilityOf(element));//метод ожидает, пока указанный элемент не станет видимым на странице, ожидает объект типа WebElement
    driver.quit();

    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://www.selenium.dev/");
    wait.until(titleIs("Selenium"));//ожидаем названия вкладки (страницы)
    driver.quit();
  }
}
