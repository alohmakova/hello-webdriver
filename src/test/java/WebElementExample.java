import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/downloads/");
    WebElement menu = driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
    menu.click();
    WebElement search = driver.findElement(By.xpath("//span[@class='DocSearch-Button-Keys']"));
    search.click();
    WebElement searchLine = driver.findElement(By.id("docsearch-input"));
    searchLine.sendKeys("HTTP");
    Thread.sleep(1000);
    WebElement choosenLine = driver.findElement(By.xpath("//*[@id='docsearch-item-2']"));
    choosenLine.click();
    driver.quit();
  }
}
