package org.task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_1 {

	public static void main(String[] args) {
		//opens firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//navigates google.com
		driver.navigate().to("http://google.com");
		
		//prints the current page URL
		System.out.println(driver.getCurrentUrl());
		
		//close the browser
		driver.close();

	}

}
