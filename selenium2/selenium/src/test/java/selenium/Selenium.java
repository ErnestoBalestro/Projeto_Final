package selenium;

import java.util.HashMap;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
  private static WebDriver driver;
  static JavascriptExecutor js;

  @BeforeAll
  public static void setUp() {
    Selenium.driver = new ChromeDriver();
    Selenium.js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }

  @AfterAll
  public static void tearDown() {
    Selenium.driver.quit();
  }

  @Test
  public void aSSERTEDITAL642019() {
    Selenium.driver.get("https://ifrs.edu.br/");
    driver.manage().window().setSize(new Dimension (699, 728));
    js.executeScript("window.scrollTo(0,2235)");
    js.executeScript("window.scrollTo(0,3390)");
    js.executeScript("window.scrollTo(0,5216)");
    {
      WebElement element = Selenium.driver.findElement(By.cssSelector(".wp-image-44299"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = Selenium.driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Selenium.driver.findElement(By.cssSelector(".acesso-todos-editais__link")).click();
    Selenium.driver.findElement(By.cssSelector("#DataTables_Table_0_filter .form-control")).click();
    Selenium.driver.findElement(By.cssSelector("#DataTables_Table_0_filter .form-control")).sendKeys("64/2019");
    Selenium.driver
        .findElement(
            By.linkText("EDITAL IFRS Nº 64/2019 FOMENTO INTERNO PARA PROJETOS DE PESQUISA E INOVAÇÃO 2020/2021"))
        .click();
    {
      List<WebElement> elements = Selenium.driver.findElements(By.cssSelector(".edital__title"));
      assert (elements.size() > 0);
    }
  }
}
