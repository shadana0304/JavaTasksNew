package org.task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {

	public static void main(String[] args) {
		
	//launch browser
		WebDriver driver = new ChromeDriver();
		
	//navigate url	
		driver.navigate().to("https://www.wikipedia.org/");
	//maximize window	
		driver.manage().window().maximize();
		
	//search "Artificial intelligence	
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence \n");
		
	//Click on History	
		driver.findElement(By.linkText("History")).click();
		
	//	prints the title of the page
		System.out.println(driver.getTitle());
		
	//close the browser	
		driver.close();
		
				
	}

}
