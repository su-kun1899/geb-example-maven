/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

driver = { new ChromeDriver() }

baseUrl = "http://gebish.org"