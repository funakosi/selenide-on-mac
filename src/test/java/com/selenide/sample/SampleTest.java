package com.selenide.sample;

import org.junit.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

public class SampleTest {
	@Test
	public void ChromeTest() {
		Configuration.browser = WebDriverRunner.CHROME;
    	System.setProperty("webdriver.chrome.driver", "exe/chromedriver");
	    Selenide.open("http://selenide.org");
	}
	@Test
	public void FireFoxTest() {
		Configuration.browser = WebDriverRunner.FIREFOX;
	    System.setProperty("webdriver.gecko.driver", "exe/geckodriver");
	    Selenide.open("http://selenide.org");
	}
	@Test
	public void SafariTest() {
		Configuration.browser = WebDriverRunner.SAFARI;
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		Selenide.open("http://selenide.org");
	}
}
