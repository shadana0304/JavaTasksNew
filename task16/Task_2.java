package org.task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) {
		//launch chrome driver
		WebDriver driver = new ChromeDriver();
		
		//navigate url
		driver.navigate().to("https://demoblaze.com/");
		
		driver.manage().window().maximize();
		
		//get the page title
		String actual = driver.getTitle();
		
		System.out.println(actual);
		
		//expected page title
		String expeted = "PRODUCT STORE";
		
		//check whether the actual and expected title are match
		if(actual.contains(expeted)) {
			
			System.out.println("Page landed on correct website");
			
		}else {
			
			System.out.println("Page not landed on correct website");
			
		}
		driver.close();
		
		

	}

}
