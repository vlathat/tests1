package jar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//adding comments
public class HelloMavenTest {
	
	

	
	@Test
	public void login ()
	{ 
		System.out.println("Hello world test maven");
		WebDriver Driver = new FirefoxDriver();
		Driver.navigate();
				
	}
	

}



