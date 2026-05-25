package testbase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass {
	  public WebDriver driver;
	  public Logger logger;
	  public Properties p;
	@BeforeClass
	@Parameters({"OS","browser"})
	public void setUp( String OS, String browser) throws IOException
	{
		//loading cofig properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger=(Logger) LogManager.getLogger(this.getClass());
		
		switch(browser.toLowerCase())
		{
		case "edge" : driver=new ChromeDriver();break;
	
		case "chrome"   :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--headless=new");
			options.addArguments("--disable-gpu");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");

			driver = new ChromeDriver(options);break;
		default :System.out.println("invalid browser");
		return;
		}
		

		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appurl"));
		
	}

	public String randomstring()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
//	@AfterClass
//	public void teardown()
//	{
//		driver.close();
//	}
}
