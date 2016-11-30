/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver

driver = {
    ChromeDriverManager.getInstance().setup()
    new ChromeDriver()
}

baseUrl = "http://www.yahoo.co.jp/"