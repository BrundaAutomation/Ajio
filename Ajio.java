package seleniumpgms;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ajio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\UDEMY SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		Actions act=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//li[@data-test='li-MEN']"));
		act.moveToElement(driver.findElement(By.partialLinkText("BRAN")).click().keyDown(driver.findElement(By.linkText("GAP")).click()).build().perform();
		 Select select = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
	        select.selectByVisibleText("Price (lowest firsth");
	        ArrayList<String> obtainedList = new ArrayList(); 
	        List<WebElement> elementList= driver.findElements(By.xpath("//select[@id='sortBy']"));
	        for(WebElement we:elementList){
	           obtainedList.add(we.getText());
	        }
	        ArrayList<String> sortedList = new ArrayList<>();   
	        for(String s:obtainedList){
	        sortedList.add(s);
	        }
	        Collections.sort(sortedList);
	        Assert.assertTrue(sortedList.equals(obtainedList));
	        driver.findElement(By.xpath("//label[contains(text(),'M (843)')]")).click();
	        
	        }
	
	
           }


