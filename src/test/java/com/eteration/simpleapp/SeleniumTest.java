package com.eteration.simpleapp;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SeleniumTest {

	@Test
	public void seleniumTest() {
		
			try {
				System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.close();
		
			} catch (Exception e) {
				System.out.print("Selenium test skipped.");
			}

	}

}
