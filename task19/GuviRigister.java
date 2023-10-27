package com.task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviRigister {

	public static void main(String[] args) {
		//browser launch
		WebDriver driver = new ChromeDriver();
		
		//launch url
		driver.get("https://www.guvi.in/register");
		
		//maximize window
		driver.manage().window().maximize();
		
		//ID locator
		driver.findElement(By.id("firstName")).sendKeys("saranya");
		
		//ClassName Locator
		driver.findElement(By.className("form-control")).sendKeys("ragu");
		
		
		//TagName locator
		driver.findElement(By.tagName("input")).sendKeys("saranya3606@gmail.com");
		
		
		//css selector locator
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Hosur@1234");
		
		//xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9551903606");
		
		
		//driver.close();

	}

}
