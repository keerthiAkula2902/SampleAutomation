package org.selenium;

import java.awt.Window;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.google.com/intl/en-US/gmail/about/");
		/*
		 * // JavascriptExecutor js = (JavascriptExecutor) driver; //
		 * js.executeScript("window.scrollBy(0,1500)"); // Actions act = new
		 * Actions(driver); // WebElement we =
		 * driver.findElement(By.xpath("//a[contains(@data-action,'sign // in')]")); ///
		 * act.moveToElement(we).build().perform();
		 * 
		 * // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); //
		 * wait.until(ExpectedConditions.elementToBeClickable(we)).click();
		 */
		driver.findElement(By.xpath("//a[contains(@data-action,'sign in')]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("akulasaisteja12");
		// System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String s = driver.findElement(By.cssSelector("div[class='Ekjuhf Jj6Lae']")).getText();
		if (s.contains("Couldn’t find your Google Account")) {
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
			// driver.findElement(By.xpath("//span[text()='Yes, continue']")).click();
			WebElement we = driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@name='firstName']"));
			// driver.findElement(By.xpath("//div[@class='H2p7Gf']//input[@name='firstName']"));
			we.sendKeys("keerthi");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Select s1=new Select(driver.findElement(By.id("month")));
			s1.selectByValue("February");
			
		}
		// driver.close();

	}

}
