/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/
import io.github.bonigarcia.wdm.PhantomJsDriverManager
import org.openqa.selenium.phantomjs.PhantomJSDriver

driver = {
//    ChromeDriverManager.getInstance().setup()
//    new ChromeDriver()
    PhantomJsDriverManager.getInstance().setup()
    new PhantomJSDriver()
}

baseUrl = "http://www.yahoo.co.jp/"