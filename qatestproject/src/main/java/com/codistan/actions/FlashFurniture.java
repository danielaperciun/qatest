package com.codistan.actions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FlashFurniture {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniela Perciun\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flashfurniture.com/ccrz__HomePage?cartID=&store=FlashFurniture");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wm-shoutout-99625\"]/div[3]/div[2]/span")).click();
		//close PopUp
		
		WebElement allCategories = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[1]/a"));
		WebElement officeTab = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[2]/a"));
		
		Actions act = new Actions (driver);
		act.moveToElement(allCategories).moveToElement(officeTab).click().build().perform();
		
		
	}

}
